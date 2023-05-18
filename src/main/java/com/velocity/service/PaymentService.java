package com.velocity.service;

import com.velocity.model.Payment;

public interface PaymentService {
	public void deletePayment(Integer id);

	public Payment getPaymentDetails(Integer id);
	public Payment savePaymentDetails(Payment payment);
}
