package com.velocity.repository;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.UserDetails;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Integer> {

}
 