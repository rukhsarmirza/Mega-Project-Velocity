package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Order;

import com.velocity.repository.OrderRepository;
import com.velocity.service.OrderService;

@Service
public class OrderIServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void deleteOrder(Integer id) {

		orderRepository.deleteById(id);
	}

	@Override
	public Optional<Order> getOrderById(Integer id) {
		Optional<Order> order = orderRepository.findById(id);
		return order;
	}

	@Override
	public Order saveOrderById(Order order) {
		Order order1 = orderRepository.save(order);
		return order1;
	}

	@Override
	public Order updateOrder(Order order) {
		return orderRepository.save(order);

	}

	@Override
	public Order addOrderDetails(Order order) {
		return orderRepository.save(order);

	}

	@Override
	public Order updateOrderDetails(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Optional<Order> getOrderDetailsById(Integer id) {
		return orderRepository.findById(id);

	}

}
