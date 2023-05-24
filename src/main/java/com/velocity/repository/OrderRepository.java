package com.velocity.repository;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Order;


@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

	public Optional<Order> findById(Integer id);
	
	
}
