package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Categary;

@Repository
public interface CategaryRepository extends CrudRepository<Categary, Serializable> {
	public Categary findById(Integer id);


}
