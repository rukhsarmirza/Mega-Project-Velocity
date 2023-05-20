package com.velocity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Order;
import com.velocity.repository.OrderRepository;
import com.velocity.service.CartAmountService;

@Service
public class CartAmountServiceImpl implements CartAmountService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public double calculateCartAmount() {

		List<Order> orders = (List<Order>) orderRepository.findAll();
		double amount = 0.0;
		for (Order order1 : orders) {
			amount += order1.getPrice() * order1.getQuantity();
		}
		return amount;
	}

}
