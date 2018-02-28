package com.roy.spring;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	private static final String SUCCESS = "success";
	
	@RequestMapping(value="hello")
	public ModelAndView hello() {
		
		ModelAndView model = new ModelAndView(SUCCESS);
		
		model.addObject("time", new Date());
		
		return model;
	}
	
}
