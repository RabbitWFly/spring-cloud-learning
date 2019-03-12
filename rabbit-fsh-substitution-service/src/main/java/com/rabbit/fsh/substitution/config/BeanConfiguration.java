package com.rabbit.fsh.substitution.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author chentao
 * Date 2019/3/9
 * Description
 **/
@Configuration
public class BeanConfiguration {

    @Bean
    @LoadBalanced
//    @MyLoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

