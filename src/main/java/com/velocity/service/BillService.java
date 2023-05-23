package com.velocity.service;

import com.velocity.model.Bill;


public interface BillService {
	public Bill getBillById(Integer id);

	public Bill updateBill(Bill bill);


	public Bill saveBill(Bill bill);

}
