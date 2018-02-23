package com.roy.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		
//		Person person = ctx.getBean(Person.class);
//		System.out.println(person);

		Address address = (Address) ctx.getBean("address");		
//		
		Address address2 = (Address) ctx.getBean("address");
//		System.out.println(address2);
//		
		System.out.println(address == address2);
		
//		Person person = ctx.getBean(Person.class);
//		System.out.println(person);
	}

}
