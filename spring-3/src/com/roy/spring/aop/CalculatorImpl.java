package com.roy.spring.aop;

import org.springframework.stereotype.Component;

@Component("calculator")
public class CalculatorImpl implements Calculator {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}
	
}
