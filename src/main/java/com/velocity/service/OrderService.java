package com.velocity.service;

import com.velocity.model.Order;


public interface OrderService {

	public void deleteOrder(Integer id);
	public Order getOrderById(Integer id);
}
