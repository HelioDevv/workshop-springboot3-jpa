package com.proweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
