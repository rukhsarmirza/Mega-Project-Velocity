package com.velocity.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Order;


@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

	
	
	
}
