package com.roy.spring.autowire;

public class Address {
	private String city;
	private String street;
	public String getStreet() {
		return street;
	}
	
	public Address() {
		System.out.println("address");
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}

}
