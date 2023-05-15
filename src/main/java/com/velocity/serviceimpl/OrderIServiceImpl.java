package com.velocity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Order;

import com.velocity.repository.OrderRepository;
import com.velocity.service.OrderService;

@Service
public class OrderIServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	@Override
	public void deleteOrder(Integer id) {
	
		orderRepository.deleteById(id);
	}
	@Override
	public Order getOrderById(Integer id) {
		Order order = orderRepository.findById(id);
		return order;
	}

}
