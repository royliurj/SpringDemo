package com.roy.spring.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	
	@Autowired
	public BaseRepository<T> repository;
	
	public void add() {
		System.out.println("Service add...");
		System.out.println(repository);
	}
}
