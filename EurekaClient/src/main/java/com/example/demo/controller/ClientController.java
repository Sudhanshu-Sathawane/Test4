package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	@GetMapping("/myName")
	public String myName() {
		return "My name is Sudhanshu";
	}
}
