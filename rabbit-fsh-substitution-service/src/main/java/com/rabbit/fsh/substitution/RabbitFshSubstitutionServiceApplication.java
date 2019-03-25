package com.rabbit.fsh.substitution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@EnableHystrix
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.rabbit.api.client"})
public class RabbitFshSubstitutionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitFshSubstitutionServiceApplication.class, args);
    }

}
