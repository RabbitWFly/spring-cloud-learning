package com.rabbit.api.client.config;

import com.rabbit.common.support.RibbonFilterContextHolder;
import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.Map;

/**
 * @Author chentao
 * Date 2019/3/24
 * Description
 **/
public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

    public FeignBasicAuthRequestInterceptor(){

    }

    @Override
    public void apply(RequestTemplate template) {
        template.header("Authorization", System.getProperty("rabbit.auth.token"));
        Map<String, String> attributes = RibbonFilterContextHolder.getCurrentContext().getAttributes();
        for (String key :  attributes.keySet()) {
            String value = attributes.get(key);
            System.out.println("feign :" + key + "\t" + value);
            template.header(key, value);
        }

    }
}

