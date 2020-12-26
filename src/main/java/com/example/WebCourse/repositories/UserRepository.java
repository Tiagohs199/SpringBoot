package com.example.WebCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebCourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
