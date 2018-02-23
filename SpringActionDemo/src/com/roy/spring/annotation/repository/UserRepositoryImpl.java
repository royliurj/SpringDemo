package com.roy.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.fabric.jdbc.FabricMySQLDataSource;
import com.roy.spring.annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired(required=false)
	private TestObject to;
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Save User");
		System.out.println(to);
	}

}
