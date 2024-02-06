package com.feedback.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.entity.Feedback;
import com.feedback.service.FeedbackService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class FeedbackController { 
	
	
	@Autowired
	private  FeedbackService feedbackService;

	
	@PostMapping("feedback")
	public  Feedback postFeedback(@RequestBody Feedback feedback) {
		return feedbackService.saveFeedback(feedback) ;
		
	}
	@GetMapping("feedback")
	public List<Feedback> getallFeedbacks(){
		System.out.println(feedbackService.getAllFeedbacks());
		return feedbackService.getAllFeedbacks();
	}
	
	@GetMapping("/feedback/{employeeId}")
	public List<Feedback> getFeedback(@PathVariable Integer employeeId) {

		return feedbackService.getFeedbackbyId(employeeId);
		
	}
	

	
}
