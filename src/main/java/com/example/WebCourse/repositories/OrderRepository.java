package com.example.WebCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebCourse.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
