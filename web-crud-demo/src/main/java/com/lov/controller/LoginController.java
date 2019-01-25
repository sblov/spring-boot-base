package com.lov.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@PostMapping(value="/user/login")
	public String login(@RequestParam("username")String username,
						@RequestParam("password")String password,
						Map<String, Object> map,HttpSession session) {
		if (!StringUtils.isEmpty(username)&&"123".equals(password)) {
			session.setAttribute("loginUser", username);
			return "redirect:/main.html";
		}
		map.put("msg", "login error");
		return "index.html";
	}
	
}
