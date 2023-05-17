package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.repository.PaymentRepository;
import com.velocity.service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	@Override
	public void deletePayment(Integer id) {
		paymentRepository.deleteById(id);
		
	}

}
