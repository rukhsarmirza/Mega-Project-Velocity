package com.velocity.service;

import com.velocity.model.Reimbursement;

public interface ReimbursementService {

	public void deleteReimbursement(Integer id);
	public Reimbursement saveReimbursement(Reimbursement reimbursement);
}
