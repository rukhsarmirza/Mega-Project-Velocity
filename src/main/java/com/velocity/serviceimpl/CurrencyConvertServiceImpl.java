package com.velocity.serviceimpl;

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

}
