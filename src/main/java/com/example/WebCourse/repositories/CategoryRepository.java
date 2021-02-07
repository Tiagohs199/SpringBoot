package com.example.WebCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebCourse.entities.enums.Category;



public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
