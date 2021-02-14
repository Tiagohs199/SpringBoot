package com.example.WebCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebCourse.entities.OrderItem;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
