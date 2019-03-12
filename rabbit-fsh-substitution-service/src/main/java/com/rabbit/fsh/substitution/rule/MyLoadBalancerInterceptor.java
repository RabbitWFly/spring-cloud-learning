package com.rabbit.fsh.substitution.rule;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.net.URI;

/**
 * 自定义请求拦截器
 * Date 2019/3/12
 * Description
 **/
public class MyLoadBalancerInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(final HttpRequest httpRequest, final byte[] bytes, final ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
        final URI originalUri = httpRequest.getURI();
        String serviceName = originalUri.getHost();
        System.out.println("进入自定义的请求拦截器中" + serviceName);
        return clientHttpRequestExecution.execute(httpRequest, bytes);
    }
}

