package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@SpringBootApplication
public class Pp331Application {


	public static void main(String[] args) {
		SpringApplication.run(Pp331Application.class, args);
	}
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
