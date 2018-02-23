package com.roy.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calculator calculator = ctx.getBean(Calculator.class);
		int result = calculator.add(1, 1);
		System.out.println("result = " + result);
		
		result = calculator.sub(2, 1);
		System.out.println("result = " + result);

		result = calculator.div(12, 0);
		System.out.println("result = " + result);
	}

}
