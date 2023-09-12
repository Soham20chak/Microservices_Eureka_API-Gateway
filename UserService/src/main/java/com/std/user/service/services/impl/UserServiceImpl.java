package com.std.user.service.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.std.user.service.entities.Marks;
import com.std.user.service.entities.User;
import com.std.user.service.exceptions.ResourceNotFoundException;
import com.std.user.service.repositories.UserRepository;
import com.std.user.service.services.UserService;
import com.std.user.service.exceptions.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public User saveUser(User user) {
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("Resource has not been found"));
		
		ArrayList<Marks> marks = restTemplate.getForObject("http://localhost:8083/marks/users/" + user.getUserId() ,ArrayList.class);
		user.setMarks(marks);
		return user;
	}
	
	
	
	
	
}
