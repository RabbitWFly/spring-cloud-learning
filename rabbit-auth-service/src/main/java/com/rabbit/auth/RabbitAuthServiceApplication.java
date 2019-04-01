package com.rabbit.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RabbitAuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitAuthServiceApplication.class, args);
    }

}
