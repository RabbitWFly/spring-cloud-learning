package com.rabbit.api.client.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Configuration;

/**
 * @Author chentao
 * Date 2019/3/24
 * Description
 **/
@Configuration
public class FeignConfiguration {

    /**
     * 日志级别
     * @return
     */
//    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    /**
     * 创建Feign请求拦截器，在发送请求前设置认证的token,各个微服务将token设置到环境变量中来达到通用
     * @return
     */
//    @Bean
    public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new FeignBasicAuthRequestInterceptor();
    }
//    @Bean
    public Request.Options options() {
        return new Request.Options(5000, 10000);
    }
}

