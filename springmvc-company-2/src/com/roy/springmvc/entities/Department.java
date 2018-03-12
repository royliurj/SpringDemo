package com.roy.springmvc.entities;

public class Department {

	private int id;
	
	private String Name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Department [Id=" + id + ", Name=" + Name + "]";
	}

	public Department(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	
	public Department() {
		
	}
	
	
	
}
