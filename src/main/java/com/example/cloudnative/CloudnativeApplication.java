package com.example.cloudnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudnativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudnativeApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World34!!!!!!ddd";
	}

}
