package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
	
	Logger logger=LoggerFactory.getLogger(DemoApplication.class);
	@PostConstruct
	public void init(String data) {
		logger.info("Application started....");
		if(data.equals("java techie")) {
			System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
