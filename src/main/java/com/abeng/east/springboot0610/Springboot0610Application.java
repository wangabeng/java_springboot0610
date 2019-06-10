package com.abeng.east.springboot0610;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.abeng.east.springboot0610")
public class Springboot0610Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot0610Application.class, args);
	}

}
