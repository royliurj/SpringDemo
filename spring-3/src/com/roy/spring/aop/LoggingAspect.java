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
	 * 返回通知
	 * 在方法正常结束执行的代码，可以访问方法的返回值
	 * */
	@AfterReturning(value="execution(* com.roy.spring.aop.Calculator.* (..))", returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("the method " + methodName + " ends " + result);
		
	}
	
	/*
	 * 	异常通知
	 * */
	@AfterThrowing(value="execution(* com.roy.spring.aop.Calculator.* (..))", throwing="ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("the method " + methodName + " occurs exception: " + ex);		
	}
	
//	/*
//	 * 环绕通知
//	 * 需要携带ProceedingJoinPoint参数
//	 * 相当于动态代理的全过程，必须有返回值，返回值为目标方法的返回值
//	 * */
//	@Around("execution(* com.roy.spring.aop.Calculator.* (..))")
//	public Object aroundMehtod(ProceedingJoinPoint joinPoint) throws Throwable {
//		
//		//执行目标方法
//		Object result = null;
//		String methodName = joinPoint.getSignature().getName();
//		List<Object> args = Arrays.asList(joinPoint.getArgs());
//		try {
//			//前置通知
//			System.out.println("the method begins " + methodName + " begins with " + args);
//			result = joinPoint.proceed();
//			
//			//返回通知
//			System.out.println("the method " + methodName + " ends " + result);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			//异常通知
//			System.out.println("the method " + methodName + " occurs exception: " + e);	
//		}
//		//后置通知
//		System.out.println("the method " + methodName + " ends");
//		return result;
//	}
}
