package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
@RestController
public class Hello {

	@RequestMapping("/hello")
	public String home() {
		return "Hello World ! I am Sibendu.";
	}


	public static void main(String[] args) {
		SpringApplication.run(Hello.class, args);
	}

}
