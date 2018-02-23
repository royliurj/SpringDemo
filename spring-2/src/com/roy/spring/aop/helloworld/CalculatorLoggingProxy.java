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
					//ǰ��֪ͨ
					result = method.invoke(target, args);
					//����֪ͨ
				} catch (Exception e) {
					// TODO: handle exception
					//�쳣֪ͨ
					e.printStackTrace();
				}				
				//����֪ͨ
				
				System.out.println("Roy => The Mehtod " + methodName + " end with " + result);
				return result;
			}
		};
		proxy = (Calculator) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}
