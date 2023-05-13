package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Reward;
import com.velocity.repository.RewardRepository;
import com.velocity.service.RewardService;

@Service
public class RewardServiceImpl implements RewardService {
	@Autowired
	private RewardRepository rewardRepository ;
	@Override
	public Reward getRewardById(Integer id) {
		Reward reward = rewardRepository.findById(id);
		return reward;
	}

}
