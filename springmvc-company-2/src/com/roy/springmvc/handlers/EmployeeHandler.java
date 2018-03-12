package com.roy.springmvc.handlers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.roy.springmvc.dao.DepartmentDao;
import com.roy.springmvc.dao.EmployeeDao;
import com.roy.springmvc.entities.Department;
import com.roy.springmvc.entities.Employee;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Controller
public class EmployeeHandler {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@RequestMapping("/emps")
	public String list(Map<String, Object> map) {
		
		map.put("employees", employeeDao.getAll());
		
		return "list";
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public String save(Employee employee) {
		System.out.println(employee);
		employeeDao.save(employee);
		
		return "redirect:/emps";
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public String input(Map<String, Object> map) {		
		map.put("departments", departmentDao.getDepartments());
//		map.put("employee", new Employee(10,"aaa",new Department(),"333"));
		map.put("ee", new Employee());
		return "input";
	}
	
	
	
}
