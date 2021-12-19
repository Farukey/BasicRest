package com.basics.gradle_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GradleSpringApplication {

	@Autowired
	ContactRepository contactRepo;

	public static void main(String[] args) {
		SpringApplication.run(GradleSpringApplication.class, args);
	}

}
