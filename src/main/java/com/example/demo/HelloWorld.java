package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/sayHello")
	public String sayHello()
	{
		return "Hi , I'm a manjunath......";
	}
}
