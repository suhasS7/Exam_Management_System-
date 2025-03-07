package com.example.ExamManagement.Bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamManagement.Model.Score;
import java.util.List;

@Repository
public interface ScoreBo extends JpaRepository<Score,Long> {
	
//	List<Score> findbymail
	List<Score> findByEmail(String email);

	

}
