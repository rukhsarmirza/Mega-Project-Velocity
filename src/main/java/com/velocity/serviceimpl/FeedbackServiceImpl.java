package com.velocity.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Feedback;
import com.velocity.repository.FeedbackRepository;
import com.velocity.service.FeedbackService;
@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public Feedback saveFeedback(Feedback feedback) {  
	Feedback feedback1	= feedbackRepository.save(feedback);
		return feedback1;
	}

	
	

}
