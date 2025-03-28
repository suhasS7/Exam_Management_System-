package com.example.ExamManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdminExam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer questionid;
	private String subject;
	private String question;
	private String opt1;
	private String opt2;
	private String opt3;
	private String opt4;
	private String ans;
	
	
	public AdminExam() {
		super();
	}


	public AdminExam( String subject, String question, String opt1, String opt2, String opt3,
			String opt4, String ans) {
		super();
		
		this.subject = subject;
		this.question = question;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.ans = ans;
	}


	public int getQuestionid() {
		return questionid;
	}


	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getOpt1() {
		return opt1;
	}


	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}


	public String getOpt2() {
		return opt2;
	}


	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}


	public String getOpt3() {
		return opt3;
	}


	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}


	public String getOpt4() {
		return opt4;
	}


	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}


	public String getAns() {
		return ans;
	}


	public void setAns(String ans) {
		this.ans = ans;
	}


	@Override
	public String toString() {
		return "AdminExam [questionid=" + questionid + ", subject=" + subject + ", question=" + question + ", opt1="
				+ opt1 + ", opt2=" + opt2 + ", opt3=" + opt3 + ", opt4=" + opt4 + ", ans=" + ans + "]";
	}


	

	


	
	
	
}
