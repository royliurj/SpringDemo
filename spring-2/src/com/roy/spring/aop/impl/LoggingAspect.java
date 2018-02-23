package com.roy.spring.aop.impl;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	//����Ϊǰ��֪ͨ
	@Before("execution(* com.roy.spring.aop.impl.Calculator.*(int,int))")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("the method begins " + methodName + " begins with " + args);
	}
	
	//����֪ͨ�������Ƿ����쳣
	@After("execution(* com.roy.spring.aop.impl.*.* (int,int))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("the method " + methodName + " ends");
	}
}
