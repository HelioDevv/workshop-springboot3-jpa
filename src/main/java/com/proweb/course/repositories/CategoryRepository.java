package com.proweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
