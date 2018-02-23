package com.roy.spring.assemblingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
		
		Person person =ctx.getBean(Person.class);
		System.out.println(person);
		
	}

}
