package com.roy.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	@RequestMapping("helloWorld")
	public String hello(){
		System.out.println("hello world");
		return "success";
	}
}
