package com.example.ExamManagement.Bo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.ExamManagement.Model.User;

@Repository
public interface UserBo extends JpaRepository<User,String> {

//	User getByEmail(String email);
//	Optional<User> findByEmail(String email);
	
	User findByEmail(String email);
	
	boolean existsByEmail(String email);	
}