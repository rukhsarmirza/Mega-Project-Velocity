package com.velocity.service;

import com.velocity.model.User;

public interface UserService {

	public User getUserdById(Integer id);

	public User saveUser(User user);

	public User updateUser(User user);

	public void deleteUser(Integer id);

	public User saveUserAddress(User user3);

}
