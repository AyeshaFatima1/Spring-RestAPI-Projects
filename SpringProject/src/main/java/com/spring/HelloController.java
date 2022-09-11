package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String getMapping() {
		return "Welcome to Spring";
	}
	@RequestMapping("/hello")
	public String getSpring() {
		return "Hello Spring";
	}
	@GetMapping("/user")
	public String getApp() {
		return "My Spring Application";
	}
	@PostMapping("/name")
	public String postMapping() {
		return "Ayesha Fatima";
	}
	@PutMapping("/put")
	private String getName(String str) {
		//str="Welcome to Ayesha";
		return "Welcome to"+str;
	}
}
