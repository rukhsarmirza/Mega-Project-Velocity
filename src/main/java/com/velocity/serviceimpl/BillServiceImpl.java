package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Bill;
import com.velocity.repository.BillRepository;
import com.velocity.service.BillService;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepository;
	@Override
	public Bill getBillById(Integer id) {
		Bill bill = billRepository.findByid(id);
		return bill;
	}
	@Override

	public Bill updateBill(Bill bill) {
		Bill bills=billRepository.save(bill);
		return bills;
	}

	public Bill saveBill(Bill bill) {
		return billRepository.save(bill);
	

	}

}
