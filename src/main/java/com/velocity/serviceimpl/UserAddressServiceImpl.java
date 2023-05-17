package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.UserAddress;
import com.velocity.repository.UserAddressRepository;
import com.velocity.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	private UserAddressRepository userAddressRepository;

	@Override
	public UserAddress updateAddressDetails(UserAddress userAddress) {
		return userAddressRepository.save(userAddress);

	}

}