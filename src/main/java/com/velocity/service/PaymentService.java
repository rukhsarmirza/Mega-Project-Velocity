package com.velocity.service;

import com.velocity.model.Payment;

public interface PaymentService {
	public void deletePayment(Integer id);
	public Payment updatePaymentDetails(Payment payment);
}
