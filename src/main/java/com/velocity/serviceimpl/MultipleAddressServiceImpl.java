package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.MultipleAddress;
import com.velocity.repository.MultipleAddressRepository;
import com.velocity.service.MultipleAddressService;

@Service
public class MultipleAddressServiceImpl implements MultipleAddressService {

	@Autowired
	private MultipleAddressRepository multipleAddressRepository;

	@Override
	public MultipleAddress saveMultipleAddress(MultipleAddress multipleAddress) {
		return multipleAddressRepository.save(multipleAddress);

	}

	@Override
	public Optional<MultipleAddress> getAddressesByUserId(Integer id) {
		return multipleAddressRepository.findById(id);

	}

}
