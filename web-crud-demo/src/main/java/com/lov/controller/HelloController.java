package com.lov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lov.exception.UserNotExistException;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(@RequestParam("user") String user) {
		if (user.equals("aaa")) {
			throw new UserNotExistException();
		}
		return "hello";
	}
	
}
