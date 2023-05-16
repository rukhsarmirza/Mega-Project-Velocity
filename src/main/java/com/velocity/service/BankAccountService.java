package com.velocity.service;

import java.util.Optional;

import com.velocity.model.BankAccount;

public interface BankAccountService {
	
	public BankAccount saveBankAccount(BankAccount bankAccount);
	public void deleteBankAccount(Integer id);
	public BankAccount updateBankAccountDetails(BankAccount bankAccount);
	public Optional<BankAccount> getBankAccountDetails(Integer bankAccont);
	

}
