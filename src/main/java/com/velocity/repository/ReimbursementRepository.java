package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Reimbursement;

@Repository
public interface ReimbursementRepository extends CrudRepository<Reimbursement, Serializable> {

	
}
