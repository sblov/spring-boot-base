package com.lov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lov.starter.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService	helloService;
	
	@GetMapping("/hello")
	public String hello(String name) {
		return helloService.sayHello(name);
	}
	
}
