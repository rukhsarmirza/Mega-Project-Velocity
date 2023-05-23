package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Provider;
import com.velocity.repository.ProviderRepository;
import com.velocity.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private ProviderRepository providerRepository;

	@Override
	public void deleteProvider(Integer id) {
		providerRepository.deleteById(id);
	}

	@Override
	public Provider saveProviderDetails(Provider provider) {
		return providerRepository.save(provider);

	}

	@Override
	public Provider updateProviderDetails(Provider provider) {
		return providerRepository.save(provider);
	}

	@Override
	public Optional<Provider> getProviderById(Integer id) {
	return	providerRepository.findById(id);
	
	}

}
