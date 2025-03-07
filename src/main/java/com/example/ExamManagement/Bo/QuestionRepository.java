package com.example.ExamManagement.Bo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamManagement.Model.Question;

@Repository("questionRepository")
public interface QuestionRepository extends CrudRepository<Question, Integer>  {

}
