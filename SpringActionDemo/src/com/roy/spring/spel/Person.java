package com.roy.spring.spel;

public class Person {
	private String name;
	private int age;
	//引用address的city
	private String city;
	//计算列
	private String info;
	
	public String getCity() {
		return city;
	}
	public String getInfo() {
		return info;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	private Car car;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + ", info=" + info + ", car=" + car + "]";
	}
}
