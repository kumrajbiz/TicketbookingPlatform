package com.java.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.net.entity.User;
import com.java.net.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	
	public User createUser(User usr) {
		return userRepository.save(usr);
	}
	
	public User getUser(String uid) {
		return userRepository.getByUserId(uid);
	}
}
