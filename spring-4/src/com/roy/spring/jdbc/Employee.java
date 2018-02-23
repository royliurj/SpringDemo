package com.roy.spring.jdbc;

public class Employee {

	private int id;
	private String lastname;
	private String email;
	private int deptId;
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", email=" + email + ", deptId=" + deptId + "]";
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
}
