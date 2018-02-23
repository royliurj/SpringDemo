package com.roy.spring.aop;

import org.springframework.cache.Cache;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calculator calculator = (Calculator) ctx.getBean("calculator");
		
		System.out.println(calculator.getClass().getName());
		
		int result = calculator.add(1, 2);
		System.out.println("Result = " + result);
		
//		result = calculator.sub(20, 10);
//		System.out.println("Result = " + result);
//		
//		result = calculator.div(20, 0);
//		System.out.println("Result = " + result);
	}

}
