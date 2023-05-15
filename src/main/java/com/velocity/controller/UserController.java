package com.velocity.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Reward;
import com.velocity.model.User;
import com.velocity.service.RewardService;
import com.velocity.service.UserService;

@RestController

public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private RewardService rewardService;
	//it is a post mettohd
	 
	@PostMapping("/post/{id}") 
	public ResponseEntity<User> saveUserReward(@RequestBody User user){
		
		User user1=userService.saveUser(user);
		List<Reward> rewards=user.getRewardList();
		
	for(Reward reward : rewards) {
			
			reward.setUserId(user.getId());
			rewardService.saveReward(reward);
	
	}
	return ResponseEntity.ok().body(user1);
	}
}

	

	

