package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.CurrencyConvert;

@Repository
public interface CurrencyConvertRepository extends JpaRepository<CurrencyConvert, Long> {

	public CurrencyConvert findById(Integer id);
}
