package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.model.OrderLimitEntity;



public interface OrderLimitEntityRepository extends JpaRepository<OrderLimitEntity, Integer> {

}
