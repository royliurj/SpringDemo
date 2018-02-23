package com.roy.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roy.spring.annotation.Service.UserService;
import com.roy.spring.annotation.controller.UserController;
import com.roy.spring.annotation.repository.UserRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
	}

}
