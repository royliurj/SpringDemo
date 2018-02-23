package com.roy.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
	private static Map<String, Car> cars = null;
	
	public InstanceCarFactory() {
		cars = new HashMap<String,Car>();
		cars.put("audi", new Car("audi",100000));
		cars.put("ford", new Car("ford",200000));
	}
	
	public Car getCar(String name) {
		return cars.get(name);
	}
}
