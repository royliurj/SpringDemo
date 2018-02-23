package com.roy.spring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.roy.spring.aop.impl.Calculator;;

public class CalculatorLoggingProxy {

	private Calculator target;
	
	public CalculatorLoggingProxy(Calculator target) {
		this.target = target;
	}
	
	public Calculator getLoggingProxy() {
		Calculator proxy = null;
		
		ClassLoader loader = target.getClass().getClassLoader();
		Class[] interfaces = new Class[] {Calculator.class};
		
		InvocationHandler h = new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				String methodName = method.getName();
				System.out.println("Roy => The method " + methodName + " begins with " + Arrays.asList(args));
				Object result = null;
				try {
					//前置通知
					result = method.invoke(target, args);
					//返回通知
				} catch (Exception e) {
					// TODO: handle exception
					//异常通知
					e.printStackTrace();
				}				
				//后置通知
				
				System.out.println("Roy => The Mehtod " + methodName + " end with " + result);
				return result;
			}
		};
		proxy = (Calculator) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}
