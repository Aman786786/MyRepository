package com.springboot.springbootfirstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/Welcome")
public class TestController {

	@GetMapping("/sayHello")
	public String sayHello() {
		
		return "Welcome to SpringBoot";
		
	}
	
}
