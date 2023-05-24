package com.velocity.service;

import java.util.Optional;

import com.velocity.model.Reimbursement;

public interface ReimbursementService {

	public void deleteReimbursement(Integer id);
	public Reimbursement saveReimbursement(Reimbursement reimbursement);
	public Reimbursement updateReimbursementDetails(Reimbursement reimbursement);
	public Optional<Reimbursement> getReimbursementDetails(Integer reimbursementId);
}
