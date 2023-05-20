package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Feedback;
@Repository
public interface FeedbackRepository extends CrudRepository<Feedback,Serializable >  {

	

}
