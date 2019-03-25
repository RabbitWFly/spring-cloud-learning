package com.rabbit.api.client.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @Author chentao
 * Date 2019/3/24
 * Description
 **/
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

    public FeignBasicAuthRequestInterceptor(){

    }

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Authorization", System.getProperty("rabbit.auth.token"));
//        Map<String, String> attributes = RibbonFilterC
    }
}

