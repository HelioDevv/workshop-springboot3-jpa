package com.proweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
