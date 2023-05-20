package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	public UserAddress saveUser(UserAddress userAddress) {
		UserAddress userAddress2 = userAddressRepository.save(userAddress);
		return userAddress2;
	}

	@Override
	public void deleteAddress(Integer id) {
		userAddressRepository.deleteById(id);

	}

	@Override
	public Optional<UserAddress> getUserAddressById(Integer id) {
		Optional<UserAddress> userAdress = userAddressRepository.findById(id);
		return userAdress;
	}

	@Override
	public UserAddress saveMultipleAddress(UserAddress userAddress) {
		UserAddress userAddress1 = userAddressRepository.save(userAddress);
		return userAddress1;
	}

}
