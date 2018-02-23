package com.roy.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.roy.spring.annotation.Service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	public void execute() {
		System.out.println("User Controller execute");
		userService.add();
	}
}
