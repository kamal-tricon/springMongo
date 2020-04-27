package com.tricon.demoSpringMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.demoSpringMongo.service.UserService;

@RestController
public class UserController {
	// another test line
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String CreateUser(@RequestParam("name") String name, @RequestParam("email") String email) {
		
		return userService.createUser(name, email);
	}
	
	@GetMapping("/list")
	public List<?> listUsers(){
		
		return userService.listUsers();
		
	}
}
