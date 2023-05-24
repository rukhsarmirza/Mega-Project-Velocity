package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.CurrencyConvert;
import com.velocity.repository.CurrencyConvertRepository;
import com.velocity.service.CurrencyConvertService;

@Service
public class CurrencyConvertServiceImpl implements CurrencyConvertService {

	@Autowired
	private CurrencyConvertRepository currencyConvertRepository;

	@Override
	public CurrencyConvert addDetails(CurrencyConvert currencyConvert) {
		return currencyConvertRepository.save(currencyConvert);

	}

	@Override
	public CurrencyConvert updateDetails(CurrencyConvert currencyConvert) {
		return currencyConvertRepository.save(currencyConvert);

	}

	@Override
	public Optional<CurrencyConvert> getCurrencyConvertorDetails(Long id) {
		return currencyConvertRepository.findById(id);

	}

	@Override
	public void deleteCurrencyConvertorDetails(Long id) {
		currencyConvertRepository.deleteById(id);
		
	}

}
