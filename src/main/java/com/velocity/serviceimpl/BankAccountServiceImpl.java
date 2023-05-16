package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.BankAccount;
import com.velocity.repository.BankAccountRepository;
import com.velocity.service.BankAccountService;


@Service
public class BankAccountServiceImpl implements BankAccountService{
	
	@Autowired
	private BankAccountRepository bankAccountRepository;
	

	@Override
	public BankAccount saveBankAccount(BankAccount bankAccount) {
		 BankAccount bankAccount1 = bankAccountRepository.save(bankAccount);
		
		return bankAccount1;
	}

	@Override
	public void deleteBankAccount(Integer id) {
		bankAccountRepository.deleteById(id);
		
	}

	@Override
	public BankAccount updateBankAccountDetails(BankAccount bankAccount) {
		return bankAccountRepository.save(bankAccount);
	}

	@Override
	public Optional<BankAccount> getBankAccountDetails(Integer bankAccont) {
		Optional <BankAccount> bankAccount= bankAccountRepository.findById(bankAccont);
		return bankAccount;
	}
	

}
