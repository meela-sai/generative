package com.initial.studio.generative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping( "/spring-boot")
@RestController
public class GenerativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenerativeApplication.class, args);
	}

}
