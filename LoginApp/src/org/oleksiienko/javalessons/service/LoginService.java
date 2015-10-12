package org.oleksiienko.javalessons.service;

import java.util.HashMap;

import org.oleksiienko.javalessons.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService(){
		users.put("johndoe", "John Doe");
		users.put("johndoe1", "John Doe1");
		users.put("johndoe2", "John Doe2");
	}
	public boolean authenticate(String userId, String password){
		if (password == null || password.trim() == "")
			return false;
		return true;
	}
	
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
	}
}
