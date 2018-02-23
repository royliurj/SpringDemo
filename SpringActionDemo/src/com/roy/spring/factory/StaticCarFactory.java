package com.roy.spring.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<String,Car>();
	
	static {
		cars.put("audi", new Car("audi",100000));
		cars.put("ford", new Car("ford",200000));
	}
	
	//静态工厂方法
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
