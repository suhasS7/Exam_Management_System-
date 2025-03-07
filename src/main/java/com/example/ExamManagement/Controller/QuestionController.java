package com.example.ExamManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.ExamManagement.Bo.ScoreBo;
import com.example.ExamManagement.Bo.UserBo;
import com.example.ExamManagement.Model.Score;
import com.example.ExamManagement.Service.QuestionService;

import jakarta.servlet.http.HttpServletRequest;



@Controller
@RequestMapping("index1")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private ScoreBo sb;
	
	@Autowired
	private UserBo ub;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap,@RequestParam("id")String id) {
		modelMap.put("questions", questionService.findAll());
		modelMap.addAttribute("id", id);
		
		return "index1";
	}
	
	@RequestMapping(value= "submit" )
	public String submit(HttpServletRequest request) {
		int score=0;
		String Result = null;
		String email=request.getParameter("emid");
		System.out.println(email);
		String []questionIds=request.getParameterValues("questionId");
		for (String questionId : questionIds) {
			int answerIdCorrect=questionService.findAnswerIdCorrect(Integer.parseInt(questionId));
			if(answerIdCorrect == Integer.parseInt(request.getParameter("question_"+ questionId))) {
				score++;
			}
		}
		if(score < 7)
		{
			Result="Fail";
		}
		else {
			Result="Pass";
		}
	
		
		Score  se=new Score(email,score,Result);
		se.setEmail(email);
		se.setScore(score);
		se.setResult(Result);
		sb.save(se);
		request.setAttribute(email, email);
		request.setAttribute("score", score);
		request.setAttribute(Result, Result);
		return "congrulation";
	}

	
	
	
	
}
