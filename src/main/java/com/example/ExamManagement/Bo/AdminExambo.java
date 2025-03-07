package com.example.ExamManagement.Bo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ExamManagement.Model.AdminExam;
@Repository
public interface AdminExambo extends JpaRepository<AdminExam,Integer > {
	
//	@Query("select ans from Admin_exam where questionid=:questionid")
//	String getAnsById(@Param("questionid") Integer questionid);
	
	
	@Query(value="select distinct(subject) from Admin_exam",nativeQuery=true)
	List<String> getExamByLang();
	
	List<AdminExam> findBySubject(String subject);
}
