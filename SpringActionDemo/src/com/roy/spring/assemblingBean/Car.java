package com.roy.spring.assemblingBean;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private int price;
	private String brand;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", brand=" + brand + "]";
	}
	
}
