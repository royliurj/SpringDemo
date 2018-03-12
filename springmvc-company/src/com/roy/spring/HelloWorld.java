package com.roy.spring;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
@SessionAttributes(value={"user"}, types= {String.class})
public class HelloWorld {
	
	@RequestMapping("/testUser")
	public String testAddUser(Map<String,Object> map) {
		map.put("aaa", new User());
		return "input";
	}
	
	@RequestMapping("testRedirect")
	public String testRedirect() {
		System.out.println("testRedirect");
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("testView")
	public String testView() {
		return "helloView";
	}
	
//	@ModelAttribute
//	public void getUser(@RequestParam(value="id", required=false) Integer id, Map<String, Object> map) {
//		if(id != null) {
//			User user = new User(1, "tom1", "123456");
//			map.put("user", user);
//			System.out.println("get data : " + user);
//		}
//	}
	
	@RequestMapping("/addUser")
	public String testUser(User user) {
		System.out.println(user);
		return SUCCESS;
	}
	
	@RequestMapping("testModelAttribute")
	public String testModelAttribute(User user) {
		System.out.println(user);
		return SUCCESS;
	}
	
	
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
