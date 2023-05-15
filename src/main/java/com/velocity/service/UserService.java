package com.velocity.service;


import com.velocity.model.User;

public interface UserService {
	public User getUserdById(Integer id);
	public User saveUser(User user);
	
}
