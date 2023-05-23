package com.velocity.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Integer> {

	public Optional<Provider> findById(Integer id);
}
