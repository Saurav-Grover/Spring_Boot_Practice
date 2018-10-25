package com.springBoot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
public class SbFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbFirstApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String hello() {
		return "Hello Spring Boot World.";
	}
	
}
