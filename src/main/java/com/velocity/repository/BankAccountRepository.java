package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Serializable>{

}
