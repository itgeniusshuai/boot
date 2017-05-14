package com.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MainApplication {

	public static void main(String[] args) {
//		SpringApplication app=new SpringApplication(MainApplication.class);
//		app.run(args);
		SpringApplication.run(MainApplication.class, args);
	}

}
