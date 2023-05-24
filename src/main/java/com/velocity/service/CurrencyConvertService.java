package com.velocity.service;

import java.util.Optional;

import com.velocity.model.CurrencyConvert;

public interface CurrencyConvertService {

	public CurrencyConvert addDetails(CurrencyConvert currencyConvert);

	public CurrencyConvert updateDetails(CurrencyConvert currencyConvert);

	public Optional<CurrencyConvert> getCurrencyConvertorDetails(Long id);

	public void deleteCurrencyConvertorDetails(Long id);
}
