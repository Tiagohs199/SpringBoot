package com.example.WebCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebCourse.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
