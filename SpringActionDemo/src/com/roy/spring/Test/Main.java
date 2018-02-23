
package com.roy.spring.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("test.xml");
		
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setText("I am A");
		System.out.println(helloWorld);
		
		HelloWorld helloWorld2 = ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld2);	
		
		ctx.registerShutdownHook();
	}
}
