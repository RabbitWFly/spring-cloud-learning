package com.rabbit.fsh.api.fallback;

import com.netflix.zuul.context.RequestContext;
import com.rabbit.common.base.ResponseCode;
import com.rabbit.common.base.ResponseData;
import com.rabbit.common.util.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @Author chentao
 * Date 2019/3/31
 * Description 服务不可用时回退功能
 **/
@Component
public class ServiceConsumerFallbackProvider implements ZuulFallbackProvider {
    private Logger log = LoggerFactory.getLogger(ServiceConsumerFallbackProvider.class);

    /**
     * 需要回退的服务名称，必须是Eureka中注册的，全部用*
     */
    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return this.getStatusCode().value();
            }

            @Override
            public String getStatusText() throws IOException {
                return this.getStatusCode().getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                RequestContext ctx = RequestContext.getCurrentContext();
                Throwable throwable = ctx.getThrowable();
                if (throwable != null) {
                    log.error("", throwable.getCause());
                }
                ResponseData data = ResponseData.fail("服务器内部错误", ResponseCode.SERVER_ERROR_CODE.getCode());
                return new ByteArrayInputStream(JsonUtils.toJson(data).getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                MediaType mt = new MediaType("application", "json", Charset.forName("UTF-8"));
                headers.setContentType(mt);
                return headers;
            }
        };
    }
}

