package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.UserDetails;
@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Serializable> {
	


}
 