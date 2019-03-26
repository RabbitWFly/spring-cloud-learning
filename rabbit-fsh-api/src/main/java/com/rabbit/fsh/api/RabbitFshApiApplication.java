package com.rabbit.fsh.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RabbitFshApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitFshApiApplication.class, args);
	}

}
