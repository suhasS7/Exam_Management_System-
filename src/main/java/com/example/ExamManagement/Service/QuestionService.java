package com.example.ExamManagement.Service;

import com.example.ExamManagement.Model.Question;

public interface QuestionService {
	
	public Iterable<Question> findAll();
	
	public int findAnswerIdCorrect(int questionId);
}
