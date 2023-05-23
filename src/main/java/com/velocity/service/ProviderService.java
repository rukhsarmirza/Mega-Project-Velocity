package com.velocity.service;

import java.util.Optional;

import com.velocity.model.Provider;

public interface ProviderService {

	public void deleteProvider(Integer id);

	public Provider saveProviderDetails(Provider provider);

	public Provider updateProviderDetails(Provider provider);

	public Optional<Provider> getProviderById(Integer id);
}
