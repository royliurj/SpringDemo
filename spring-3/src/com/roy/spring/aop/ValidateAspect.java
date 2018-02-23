package com.roy.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ValidateAspect {
	
	@Before("LoggingAspect.delcareJoinPointExpression()")
	public void beforeMethod() {
		System.out.println("validate before method");
	}
}
