package com.example.ExamManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamManagement.Bo.QuestionRepository;
import com.example.ExamManagement.Model.Answer;
import com.example.ExamManagement.Model.Question;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired	
	private QuestionRepository questionRepository;
	@Override
	public Iterable<Question> findAll() {
		// TODO Auto-generated method stub
		return questionRepository.findAll() ;
	}
	@Override
	public int findAnswerIdCorrect(int questionId) {
		Question question=questionRepository.findById(questionId).get();
		for(Answer answer : question.getAnswer()) {
			if(answer.isCorrect()) {
				return answer.getId();
			}
		}
		return -1;
	}
	
	

}
