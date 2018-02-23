package com.roy.spring.aop;

import java.util.Arrays;
import java.util.List;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.patterns.Declare;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class LoggingAspect {
	
	@Pointcut("execution(public int com.roy.spring.aop.Calculator.*(..))")
	public void delcareJoinPointExpression() {}

	@Before("delcareJoinPointExpression()")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("the method begins " + methodName + " begins with " + args);
	}

	@After("execution(public int com.roy.spring.aop.Calculator.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("the method " + methodName + " ends");
	}
	
	/*
	 * ����֪ͨ
	 * �ڷ�����������ִ�еĴ��룬���Է��ʷ����ķ���ֵ
	 * */
	@AfterReturning(value="execution(* com.roy.spring.aop.Calculator.* (..))", returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("the method " + methodName + " ends " + result);
		
	}
	
	/*
	 * 	�쳣֪ͨ
	 * */
	@AfterThrowing(value="execution(* com.roy.spring.aop.Calculator.* (..))", throwing="ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("the method " + methodName + " occurs exception: " + ex);		
	}
	
//	/*
//	 * ����֪ͨ
//	 * ��ҪЯ��ProceedingJoinPoint����
//	 * �൱�ڶ�̬�����ȫ���̣������з���ֵ������ֵΪĿ�귽���ķ���ֵ
//	 * */
//	@Around("execution(* com.roy.spring.aop.Calculator.* (..))")
//	public Object aroundMehtod(ProceedingJoinPoint joinPoint) throws Throwable {
//		
//		//ִ��Ŀ�귽��
//		Object result = null;
//		String methodName = joinPoint.getSignature().getName();
//		List<Object> args = Arrays.asList(joinPoint.getArgs());
//		try {
//			//ǰ��֪ͨ
//			System.out.println("the method begins " + methodName + " begins with " + args);
//			result = joinPoint.proceed();
//			
//			//����֪ͨ
//			System.out.println("the method " + methodName + " ends " + result);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			//�쳣֪ͨ
//			System.out.println("the method " + methodName + " occurs exception: " + e);	
//		}
//		//����֪ͨ
//		System.out.println("the method " + methodName + " ends");
//		return result;
//	}
}
