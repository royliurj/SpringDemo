package com.roy.springmvc.entities;

public class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	private int id;
	
	private String name;
	
	private Department department;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}


	
	public Employee(int id, String name, Department department, String email) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.email = email;
	}

	public Employee(){
		
	}

	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
