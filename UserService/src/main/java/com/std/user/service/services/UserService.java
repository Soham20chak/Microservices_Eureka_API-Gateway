package com.std.user.service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.std.user.service.entities.User;

@Service
public interface UserService {
	//create a user
	User saveUser(User user);
	
	//return all the users
	List<User> getAllUser();
	
	//return users from given userId
	User getUser(String userId);
}
