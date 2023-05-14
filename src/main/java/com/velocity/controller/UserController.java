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

import com.velocity.model.Reimbursement;
import com.velocity.model.Reward;
import com.velocity.model.User;
import com.velocity.service.DeleteOrderService;
import com.velocity.service.ReimbursementService;
import com.velocity.service.RewardService;
import com.velocity.service.UserService;

@RestController

public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RewardService rewardService;
	
	@Autowired
	private DeleteOrderService deleteOrderService;
	@Autowired
	private ReimbursementService reimbursementService;

	// it is a post mettohd
	@PostMapping("/saverewards")
	public ResponseEntity<User> saveUserReward(@RequestBody User user) {

		User user1 = userService.saveUser(user);
		List<Reward> rewards = user.getRewardList();

		for (Reward reward : rewards) {

			reward.setUserId(user.getId());
			rewardService.saveReward(reward);
		}

		return ResponseEntity.ok().body(user1);
	}

	// its a controller class with get reward funtion
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUserReward(@PathVariable("id") Integer id) {

		User user = userService.getUserdById(id);
		List<Reward> rewards = user.getRewardList();

		for (Reward reward : rewards) {
			reward.setUserId(user.getId());
			rewardService.getRewardById(id);
		}
		return ResponseEntity.ok().body(user);

	}
    // this method is for delete operation
	@DeleteMapping("/delete/{id}")
	public void deleteRewardById(@PathVariable("id") Integer id) {
		rewardService.deleteReward(id);
	}
	
	@DeleteMapping("/deleteorder/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {

		deleteOrderService.deleteOrder(id);

	}
	
	@DeleteMapping("/deletereimbursement/{id}")
	public void deletereimbursement(@PathVariable("id") Integer id) {

		reimbursementService.deleteReimbursement(id);

	}
	@PostMapping("/saveReimbursement")
	public ResponseEntity<Reimbursement> saveUserReimbursement(@RequestBody Reimbursement reimbursement ){
		Reimbursement reimbursement1 = reimbursementService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement1);
	}
}
