package com.velocity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Order;
import com.velocity.model.Reimbursement;
import com.velocity.model.Reward;
import com.velocity.model.User;
import com.velocity.service.OrderService;
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
	private OrderService OrderService;
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
	@GetMapping("/getreward/{id}")
	public ResponseEntity<User> getUserReward(@PathVariable("id") Integer id) {

		User user = userService.getUserdById(id);
		List<Reward> rewards = user.getRewardList();

		for (Reward reward : rewards) {
			reward.setUserId(user.getId());
			rewardService.getRewardById(id);
		}
		return ResponseEntity.ok().body(user);

	}

	// this method is for delete reward operation
	@DeleteMapping("/delete/{id}")
	public void deleteRewardById(@PathVariable("id") Integer id) {
		rewardService.deleteReward(id);
	}

	@DeleteMapping("/deleteorder/{id}")
	public void deleteOrder(@PathVariable("id") Integer id) {

		OrderService.deleteOrder(id);

	}

	@DeleteMapping("/deletereimbursement/{id}")
	public void deletereimbursement(@PathVariable("id") Integer id) {

		reimbursementService.deleteReimbursement(id);

	}

	@PostMapping("/saveReimbursement")
	public ResponseEntity<Reimbursement> saveUserReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement1 = reimbursementService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement1);
	}

	@PutMapping("/updateReimbursement/{id}")
	public Reimbursement updateReimbursementDetails(@RequestBody Reimbursement reimbursement) {
		return reimbursementService.updateReimbursementDetails(reimbursement);
	}

	@GetMapping("/getReimbursement/{id}")
	public ResponseEntity<Optional<Reimbursement>> getReimbursementDetails(@PathVariable("id") Integer id) {
		Optional<Reimbursement> reimbursement = reimbursementService.getReimbursementDetails(id);
		return ResponseEntity.ok().body(reimbursement);
	}

	@GetMapping("/getUser/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Integer id) {

		User user = userService.getUserdById(id);
		List<Order> orders = user.getOrderList();

		for (Order order : orders) {
			order.setUserid(user.getId());
			OrderService.getOrderById(id);
		}
		return ResponseEntity.ok().body(user);

	}

	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		User user1 = userService.saveUser(user);
		List<Order> orders = user.getOrderList();

		for (Order order : orders) {
			order.setUserid(user.getId());
			OrderService.saveOrderById(order);
		}

		return ResponseEntity.ok().body(user1);
	}

	@PutMapping("/updateUser/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User user1 = userService.updateUser(user);
		List<Order> orders=user.getOrderList();
		
		for(Order order : orders) {
			order.setPrice(order.getPrice());
			order.setProductName(order.getProductName());
			order.setQuantity(order.getQuantity());
			order.setUserid(order.getUserid());
			
			OrderService.updateOrder(order);
		}
		
		return ResponseEntity.ok().body(user1);
	}

}
