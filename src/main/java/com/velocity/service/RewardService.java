package com.velocity.service;

import com.velocity.model.Reward;

public interface RewardService {
	public Reward getRewardById(Integer id);
	public Reward saveReward(Reward reward);
	public void deleteReward(Integer id);
}
