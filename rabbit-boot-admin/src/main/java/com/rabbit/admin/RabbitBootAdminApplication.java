package com.rabbit.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableDiscoveryClient
public class RabbitBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitBootAdminApplication.class, args);
	}

}
