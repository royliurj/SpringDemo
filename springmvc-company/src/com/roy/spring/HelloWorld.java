package com.roy.spring;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sun.media.sound.ModelInstrumentComparator;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

@Controller
@SessionAttributes(value={"testsession"}, types= {String.class})
public class HelloWorld {
	@RequestMapping("testSession")
	public String testSession(Map<String, Object> map) {
		map.put("testsession", Arrays.asList("TOM","ROY"));		
		return SUCCESS;
	}
	private static final String SUCCESS = "success";
	
	@RequestMapping(value="hello")
	public ModelAndView hello() {
		
		ModelAndView model = new ModelAndView(SUCCESS);
		
		model.addObject("time", new Date());
		
		return model;
	}
	
	@RequestMapping("testMap")
	public String testMap(Map<String, Object> map) {
		map.put("names", "123");		
		return SUCCESS;
	}
	

}
