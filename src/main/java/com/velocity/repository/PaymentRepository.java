package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Serializable>{

}
