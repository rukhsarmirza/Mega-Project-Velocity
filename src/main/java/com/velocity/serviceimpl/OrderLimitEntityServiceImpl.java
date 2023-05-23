package com.velocity.serviceimpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.velocity.model.OrderLimitEntity;
import com.velocity.repository.OrderLimitEntityRepository;
import com.velocity.service.OrderLimitEntityService;

@Service
public class OrderLimitEntityServiceImpl implements OrderLimitEntityService {
	public OrderLimitEntityRepository orderLimitEntityRepository;

	@Override
	public OrderLimitEntity addOrderLimitEntityDetails(OrderLimitEntity orderLimitEntity) {
		OrderLimitEntity orderLimitEntity1 = orderLimitEntityRepository.save(orderLimitEntity);
		return orderLimitEntity1;
	}

	@Override
	public Optional<OrderLimitEntity> getOrderLimitEntityById(Integer id) {

		Optional<OrderLimitEntity> orderLimitEntity1 = orderLimitEntityRepository.findById(id);
		return orderLimitEntity1;
	}

	@Override
	public OrderLimitEntity updateOrderLimitEntity(OrderLimitEntity orderLimitEntity) {
		// Bill bills=billRepository.save(bill);
		OrderLimitEntity orderLimitEntity1 = orderLimitEntityRepository.save(orderLimitEntity);
		return orderLimitEntity1;
	}

}
