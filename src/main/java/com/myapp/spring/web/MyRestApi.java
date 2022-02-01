package com.myapp.spring.web;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MyRestApi {
	@GetMapping
	
	public String sayHellow() {
		return "welcome to world of rest api with java spring and current date" 
	+LocalDate.now();
		
	}
@GetMapping("/hello")
	
	public String sayHellow1() {
		return "welcome to world of rest api with java spring and current date" 
	+LocalDate.now();
		
	}

}
