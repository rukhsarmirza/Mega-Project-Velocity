package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Order;
import com.velocity.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {

	public User findById(Integer id);

	public User save(Order order);
	
	

}
