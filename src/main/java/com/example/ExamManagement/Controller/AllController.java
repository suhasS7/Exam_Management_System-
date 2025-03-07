package com.example.ExamManagement.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.nio.file.Files;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.ExamManagement.Bo.AdminBo;
import com.example.ExamManagement.Bo.AdminExambo;
import com.example.ExamManagement.Bo.ScoreBo;
import com.example.ExamManagement.Bo.UserBo;
import com.example.ExamManagement.Model.Admin;
import com.example.ExamManagement.Model.AdminExam;
import com.example.ExamManagement.Model.Score;
import com.example.ExamManagement.Model.User;
import com.example.ExamManagement.Service.QuestionService;
import com.example.ExamManagement.Service.ScoreService;
import com.example.ExamManagement.Service.UserService;


import jakarta.servlet.http.HttpServletRequest;

@RestController

public class AllController {
	
	@Autowired
	UserBo ub;
	
	@Autowired
	AdminBo ab;
	
	@Autowired
	UserService us;
	
	@Autowired
	ScoreService ss;
	
	@Autowired
	ScoreBo sb;
	
	@Autowired
	AdminExambo axb;
	
	@RequestMapping("/")

	public ModelAndView m1() {

		return new ModelAndView("index");

	}
// 
//	
//
	  @RequestMapping("/index") 

	  public ModelAndView m11() { 

		  return new ModelAndView("index"); 

	 }

	
	@RequestMapping("/register")

	public ModelAndView m2() {

		return new ModelAndView("register");

	}
	
	@RequestMapping(value="insertUser", method=RequestMethod.POST)

	public ModelAndView insertUser(HttpServletRequest req) {

		ModelAndView mv=null;

		String email=req.getParameter("email");

		String First_name=req.getParameter("First_name");
		
		String Last_name=req.getParameter("Last_name");

		String gender=req.getParameter("gender");

		String pass=req.getParameter("pass");
		
		if (ub.existsByEmail(email)) {
			System.out.println("existed");
			mv = new ModelAndView("register");
			mv.addObject("error", "Email Already Registered");
			return mv;
		}
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		
			// Compile the ReGex
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(pass);
			if (!m.matches()) {
				System.out.println("password error");
				mv = new ModelAndView("register");
				mv.addObject("error", "Password length is less than 8  must contains special character and symbol");
				return mv;
			}
			System.out.println("not existed");


		User u1=new User(email,First_name,Last_name,pass,gender,"Student");
		
		try {
		ub.save(u1);
		mv=new ModelAndView("login");
		}
		catch(Exception e){
			mv=new ModelAndView("error");
		}
		return mv;

	}
	

	
	@RequestMapping("/login")

	public ModelAndView getLogin() {

		return new ModelAndView("login");

	}
	
	ModelAndView mv2 = new ModelAndView();
	@RequestMapping(value="checkuser",method=RequestMethod.POST)

	public ModelAndView checkUser(@RequestParam("email") String email,@RequestParam("pass") String pass) {
		ModelAndView mv = new ModelAndView("login");

	
		try {
		User u1=ub.getById(email);
		
		

		if(u1!=null && email.equals(u1.getEmail())&& pass.equals(u1.getPassword())) {
			 mv = new ModelAndView("Student_dashboard");
			 mv.addObject("id", u1.getEmail());
//			 mv.addObject()
			 System.out.println("login successful"+u1.getEmail());
			 
			 List<String> li=axb.getExamByLang();
			 System.out.println(li);
			 mv.addObject("lang", li);
			mv2.addObject("email", u1.getEmail());

		
			}
			else {

				return new ModelAndView("login");
			}
		}
		catch(Exception e)
		{
			
			try {
				Admin a1=ab.getById(email);
				
		
				System.out.println(a1.getAdmin_email()+"  "+email+" "+pass+" "+email);
		
				if(email.equals(a1.getAdmin_email())) {
		
					if(pass.equals(a1.getAdmin_pass())) {
						mv=new ModelAndView("Admin_dashboard");
//						List<User> li=ub.findAll();
//						System.out.println(li);
//						mv.addObject("Users", li);

					}
					else {
		
						mv=new ModelAndView("login");
					}
				}
		
				else {
		
					mv=new ModelAndView("login");
		
				}	
			} catch (Exception e2) {
				// TODO: handle exception
				mv=new ModelAndView("login");
				
			}
		}
		
		
		return mv;
		
	}
	
	

	
	@RequestMapping("/updateuser")

	public ModelAndView updateMovie(HttpServletRequest req, @RequestParam String id) {

		ModelAndView mv=new ModelAndView("updateuser");

		//int id=Integer.parseInt(req.getParameter("id"));

		User m=us.getUserByEmail(id);

		mv.addObject("user", m);

		return mv;
		
		

	}
	
	@RequestMapping("/submitscore")
	public ModelAndView result(HttpServletRequest request,@RequestParam("id") String id) {
		System.out.println(id);

		ModelAndView mv=new ModelAndView("result");
//		Score si=sb.getById(id);
//		System.out.println("------------"+si);
		List<Score> s2=sb.findByEmail(id);
		System.out.println("------------"+s2.toString());
//		
////		Score s2=sb.findbymail(id);
		mv.addObject("scores",s2);
////		System.out.println(si);
		return mv;
	}
	
	
	@RequestMapping(value="updateuserdetails", method=RequestMethod.POST)

	public ModelAndView updatem(HttpServletRequest req) {

		ModelAndView mv=null;

		System.out.println(req.getParameter("email"));
		String email=req.getParameter("email");

		String First_name=req.getParameter("First_name");

		String Last_name=req.getParameter("Last_name");
		String pass=req.getParameter("pass");

		String gender=req.getParameter("gender");

//		LocalDate ld=LocalDate.parse(req.getParameter("pass"));
		

		User m=new User(email,First_name,Last_name,pass,gender,"Student");;

		try {

	    us.updateUser(m);

	    //mv.addObject("mess", "Value updated Successfully");

	    mv=new ModelAndView("success");

		}

		catch(Exception e) {

			mv=new ModelAndView("error");

		}

		return mv;

	}

	
	@RequestMapping("/StudentRecord")

	public ModelAndView getAllMovies() {

		ModelAndView mv=new ModelAndView("StudentRecord");

		List<User> li=ub.findAll();
		System.out.println(li);
		System.out.println("hello");
		mv.addObject("Users", li);


		return mv;

	}
	
	
	@RequestMapping("/MakeExam")
	public ModelAndView makeexam() {
		ModelAndView mv=new ModelAndView("MakeExam");
		return mv;
	}

	@RequestMapping(value="makeexam" ,method=RequestMethod.POST)
	public ModelAndView makeexam1(HttpServletRequest req) {
		ModelAndView mv=null;
//		String content=req.getParameter("question");
//		System.out.println(content);
//		JavaExam je=new JavaExam(0,content);
//		jr.save(je);
//		
//		String content1=req.getParameter("content1");
//		boolean correct=req.getParameter("correct") != null;
//		String questionid=req.getParameter("qid");
//		 
//		
//		
//		
//		JavaAns js=new JavaAns(je,content1,correct);
//		jar.save(js);
		
		String Question =req.getParameter("id");
		String opt1=req.getParameter("ans1");
		String opt2=req.getParameter("ans2");
		String opt3=req.getParameter("ans3");
		String opt4=req.getParameter("ans4");
		String Ans=req.getParameter("real");
		String sub=req.getParameter("sub");
		
		AdminExam ae=new AdminExam(sub,Question,opt1,opt2,opt3,opt4,Ans);
		axb.save(ae);
//		System.out.println(ae.toString());
//		System.out.println(axb.getAnsById(ae.getQuestionid()));
		
		
		
		return mv;
		
	}
	@RequestMapping("viewexambysub")

	public ModelAndView viewexam(@RequestParam("sub") String sub) {
		
		ModelAndView mv=new ModelAndView("viewexambysub");
		
		List<AdminExam> exam=axb.findBySubject(sub);
		
		mv.addObject("exam", exam);
		mv.addObject("email", mv2.getModel().get("email"));
		
		
		
		return mv;
		
		
		
	}
	
	@RequestMapping("scorefetch")
	public ModelAndView getscore(HttpServletRequest req)
	{
		ModelAndView mv=new ModelAndView("congrulation");
		String []questionIds=req.getParameterValues("qid");
		System.out.println(Arrays.toString(questionIds));
		String Result = null;
		String email=req.getParameter("emid");
		
		int score=0;
		for (String questionId : questionIds) {
			
			
			AdminExam ques=axb.getById(Integer.valueOf(questionId));
			if(ques.getAns().equals(req.getParameter("que"+ questionId))) 
			{
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
		System.out.println(score);
		System.out.println(email);
		
		Score  se=new Score(email,score,Result);
		se.setEmail(email);
		se.setScore(score);
		se.setResult(Result);
		sb.save(se);
		req.setAttribute(email, email);
		req.setAttribute("score", score);
		req.setAttribute(Result, Result);
		return mv;
		
		
		
		
		
		
	
		
	}


	
	
}
