package com.example.ExamManagement.Bo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExamManagement.Model.Admin;

public interface AdminBo extends JpaRepository<Admin, String> {

}
