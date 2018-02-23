package com.roy.spring.spel;

public class Car {

	private String brand;
	private int price;	
	private double Perimeter;
	public void setPerimeter(double perimeter) {
		Perimeter = perimeter;
	}
	public double getPerimeter() {
		return Perimeter;
	}

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
		return "Car [brand=" + brand + ", price=" + price + ", Perimeter=" + Perimeter + "]";
	}


	
}
