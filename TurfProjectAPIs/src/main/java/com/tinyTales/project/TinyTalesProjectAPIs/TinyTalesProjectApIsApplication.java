package com.tinyTales.project.TinyTalesProjectAPIs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.tinyTales.project.TinyTalesProjectAPIs.repository")
@ComponentScan("com.tinyTales.project.TinyTalesProjectAPIs.controller")
@ComponentScan("com.tinyTales.project.TinyTalesProjectAPIs.service")
@ComponentScan("com.tinyTales.project.TinyTalesProjectAPIs.utils")
public class TinyTalesProjectApIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TinyTalesProjectApIsApplication.class, args);
	}

}
