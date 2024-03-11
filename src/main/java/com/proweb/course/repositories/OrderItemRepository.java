package com.proweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
