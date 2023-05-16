package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Cart;
@Repository
public interface CartRepository extends CrudRepository<Cart, Serializable> {
		
}
