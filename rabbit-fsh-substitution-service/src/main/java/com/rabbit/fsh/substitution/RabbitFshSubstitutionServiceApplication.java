package com.rabbit.fsh.substitution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RabbitFshSubstitutionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitFshSubstitutionServiceApplication.class, args);
    }

}
