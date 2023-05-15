package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.velocity.model.User;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;
@Service
public class UserServiceImpl implements UserService  {
	@Autowired
	public UserRepository userRepository ;
	@Override
	public User getUserdById(Integer id) {
		User user = userRepository.findById(id);
		return user;
	}
	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}
	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}
	
	
}
