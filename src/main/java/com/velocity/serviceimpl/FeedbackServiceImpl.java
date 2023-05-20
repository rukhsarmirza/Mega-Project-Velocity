package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.velocity.model.Feedback;
import com.velocity.service.FeedbackService;

public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	private com.velocity.repository.FeedbackRepository feedbackRepository;

	@Override
	public Feedback saveFeedback(Feedback feedback) {  
	Feedback feedback1	= feedbackRepository.save(feedback);
		return feedback1;
	}

	@Override
	public Optional<Feedback> getFeedbackDetails(Integer feedbackid) {
		
		return null;
	}
	

}
