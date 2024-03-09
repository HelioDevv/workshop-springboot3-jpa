package com.proweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
