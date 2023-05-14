package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.repository.DeleteOrderRepository;
import com.velocity.service.DeleteOrderService;

@Service
public class DeleteOrderImpl implements DeleteOrderService{

	@Autowired
	private DeleteOrderRepository deleteOrderRepository;
	@Override
	public void deleteOrder(Integer id) {
		// TODO Auto-generated method stub
		
		deleteOrderRepository.deleteById(id);
	}

}
