package com.rabbit.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class RabbitZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitZipkinApplication.class, args);
	}

}
