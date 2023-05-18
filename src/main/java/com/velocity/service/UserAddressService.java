package com.velocity.service;


import java.util.Optional;

import com.velocity.model.UserAddress;

public interface UserAddressService {

	public UserAddress updateAddressDetails(UserAddress userAddress);
	public UserAddress saveUser(UserAddress userAddress);
	public void deleteAddress(Integer id);
	public Optional<UserAddress> getUserAddressById(Integer id);
}
