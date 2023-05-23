package com.velocity.service;



import java.util.Optional;

import com.velocity.model.OrderLimitEntity;

public interface OrderLimitEntityService {
public OrderLimitEntity addOrderLimitEntityDetails(OrderLimitEntity orderLimitEntity);
public Optional<OrderLimitEntity> getOrderLimitEntityById(Integer id);
public OrderLimitEntity updateOrderLimitEntity(OrderLimitEntity orderLimitEntity);
}
