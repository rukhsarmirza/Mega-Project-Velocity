package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer>{
	public Bill findByid(Integer id);

}
