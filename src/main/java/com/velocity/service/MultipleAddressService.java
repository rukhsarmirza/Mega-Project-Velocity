package com.velocity.service;

import java.util.Optional;

import com.velocity.model.MultipleAddress;

public interface MultipleAddressService {

	public MultipleAddress saveMultipleAddress(MultipleAddress multipleAddress);

	public Optional<MultipleAddress> getAddressesByUserId(Integer id);

}
