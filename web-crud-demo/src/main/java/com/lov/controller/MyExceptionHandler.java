package com.lov.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import com.lov.exception.UserNotExistException;

@ControllerAdvice
public class MyExceptionHandler {
	
	
	@ExceptionHandler(UserNotExistException.class)
	public String handlerException(Exception e,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		request.setAttribute("javax.servlet.error.status_code", 500);
		map.put("code", "user.notexsit");
		map.put("message", e.getMessage());
		
		request.setAttribute("ext", map);
		return "forward:/error";
	}
	
	
}
