package com.roy.springmvc.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roy.springmvc.entities.Department;
import com.roy.springmvc.entities.Employee;

@Repository
public class EmployeeDao {

	private int initId = 1005;
	
	private static Map<Integer, Employee> employees = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static {
		employees = new HashMap<Integer, Employee>();

		employees.put(1001, new Employee(1001,"E-aa",new Department(101,"D-aa"), "aa@123.com"));		
		employees.put(1002, new Employee(1002,"E-bb",new Department(102,"D-bb"),"bb@123.com"));
		employees.put(1003, new Employee(1003,"E-cc",new Department(103,"D-cc"),"cc@123.com"));
		employees.put(1004, new Employee(1004,"E-dd",new Department(104,"D-dd"),"dd@123.com"));
		employees.put(1005, new Employee(1005,"E-ee",new Department(105,"D-ee"),"ee@123.com"));
	}
	
	public void save(Employee employee) {
		
		if(employee.getId() == 0){
			employee.setId(initId++);
		}
		
//		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	
	public Collection<Employee> getAll(){
		return employees.values();
	}
	
	public Employee get(Integer id) {
		return employees.get(id);
	}
	
	public void delete(Integer id) {
		employees.remove(id);
	}
	
}
