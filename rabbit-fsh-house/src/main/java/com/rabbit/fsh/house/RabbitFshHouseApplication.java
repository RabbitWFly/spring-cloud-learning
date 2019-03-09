package com.rabbit.fsh.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RabbitFshHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitFshHouseApplication.class, args);
    }

}
