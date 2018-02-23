package com.roy.spring.aop.helloworld;

import com.roy.spring.aop.impl.Calculator;
import com.roy.spring.aop.impl.CalculatorImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calculator calculator = new CalculatorImpl();
//		calculator.add(1, 2);
		
		Calculator target = new CalculatorImpl();
		
		Calculator proxy = new CalculatorLoggingProxy(target).getLoggingProxy();
		
		proxy.add(1, 1);
	}

}
