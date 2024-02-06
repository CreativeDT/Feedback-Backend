package com.feedback.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.entity.Feedback;
import com.feedback.repository.FeedbackRepository;


import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class FeedbackService {
	
	@Autowired //Dependency injection of referencing the feedbackRepoitory.
	private FeedbackRepository feedbackRepository; //reference variable of the object 
	
	public Feedback saveFeedback(Feedback feedback) {
		return feedbackRepository.save(feedback) ;
		
	}
	
	public List<Feedback> getAllFeedbacks(){
		return feedbackRepository.findAll();
	}
	
	public List<Feedback> getFeedbackbyId(Integer employeeId) {
	
		return feedbackRepository.findByEmployeeId(employeeId);
	}

	
}
