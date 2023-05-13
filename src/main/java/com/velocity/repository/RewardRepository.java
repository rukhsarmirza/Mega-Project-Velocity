package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Reward;
@Repository
public interface RewardRepository extends CrudRepository<Reward, Serializable>{
	public Reward findById(Integer id);
	
}
