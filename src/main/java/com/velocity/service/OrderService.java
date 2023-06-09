package com.velocity.service;

import java.util.Optional;

import com.velocity.model.Order;

public interface OrderService {

	public void deleteOrder(Integer id);

	public Optional<Order> getOrderById(Integer id);

	public Order saveOrderById(Order order);

	public Order updateOrder(Order order);

	public Order addOrderDetails(Order order);

	public Order updateOrderDetails(Order order);

	public Optional<Order> getOrderDetailsById(Integer id);

}
