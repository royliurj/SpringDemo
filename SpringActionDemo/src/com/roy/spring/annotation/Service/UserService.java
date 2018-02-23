package com.roy.spring.annotation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.roy.spring.annotation.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	@Qualifier("userRepositoryImpl")
	private UserRepository userRepository;
	
	public void add() {
		System.out.println("User Service Add");
		userRepository.save();
	}
}
