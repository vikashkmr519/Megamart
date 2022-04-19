package com.megamart.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megamart.orderservice.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
