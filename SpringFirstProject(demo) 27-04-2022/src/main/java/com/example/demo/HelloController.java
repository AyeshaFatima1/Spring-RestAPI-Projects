package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "My first Spring Application";
	}
}
//run as localhost:8080 then our requestmapping string ex(/hello) on web