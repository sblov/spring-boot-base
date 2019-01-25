package com.lov.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lov.entity.User;
import com.lov.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") Integer id) {
		return userRepository.findById(id);
	}
	
	@GetMapping("/user")
	public User insertUser(User user) {
		return userRepository.save(user);
	}
	
}
