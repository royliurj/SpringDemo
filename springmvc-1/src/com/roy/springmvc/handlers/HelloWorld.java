package com.roy.springmvc.handlers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorld {

	public String hello(){
		System.out.println("hello world");
		return "success";
	}
}
