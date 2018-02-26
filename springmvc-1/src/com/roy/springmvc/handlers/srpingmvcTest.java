package com.roy.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/springmvc")
public class srpingmvcTest {

	private static final String SUCCESS = "success";
	
	@RequestMapping("/test")
	public String testRequestMapping(){
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testMehod", method=RequestMethod.POST)
	public String testMehod(){
		System.out.println("testMehod");
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testParamtersAndHeaders", params={"username","age!=10"}, headers={"aa"})
	public String testParamtersAndHeaders(){		
		System.out.println("testParamtersAndHeaders");
		return SUCCESS;
		
	}
	
}
