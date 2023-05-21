package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.MultipleAddress;

@Repository
public interface MultipleAddressRepository extends JpaRepository<MultipleAddress, Integer> {

}
