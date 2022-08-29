package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootWithDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithDockerApplication.class, args);
	}
	@GetMapping("/hi")

	 public String sayHi()

	 {

	 return "Welcome To Docker Application";

	 }

}
