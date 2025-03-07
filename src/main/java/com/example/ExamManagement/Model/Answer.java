package com.example.ExamManagement.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "answer")
public class Answer implements java.io.Serializable {

	private static final long serialVersionUID=1L;
	private Integer id;
	private Question question;
	private String content;
	private boolean correct;
	public Answer() {
		super();
	}
	public Answer(Question question, String content, boolean correct) {
		super();
		this.question = question;
		this.content = content;
		this.correct = correct;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",unique=true,nullable=false)
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id",nullable=false)
	public Question getQuestion() {
		return this.question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Column(name="content",nullable=false)
	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Column(name="correct",nullable=false)
	public boolean isCorrect() {
		return this.correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	
}
