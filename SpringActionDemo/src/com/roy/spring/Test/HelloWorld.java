package com.roy.spring.Test;

public class HelloWorld {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "HelloWorld [text=" + text + "]";
	}

	public void init(){
		System.out.println("Init");		
	}
	
	public void destroy() {
		System.out.println("Destroy");
	}
	
	
}
