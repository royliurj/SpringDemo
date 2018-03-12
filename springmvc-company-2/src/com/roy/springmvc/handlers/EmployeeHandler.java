package com.roy.springmvc.handlers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roy.springmvc.dao.EmployeeDao;

@Controller
public class EmployeeHandler {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/emps")
	public String list(Map<String, Object> map) {
		
		map.put("employees", employeeDao.getAll());
		
		return "list";
	}
	
}
