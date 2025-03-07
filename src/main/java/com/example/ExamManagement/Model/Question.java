package com.example.ExamManagement.Model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import  jakarta.persistence.GeneratedType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="question")
public class Question implements java.io.Serializable {

	private static final long serialVersionUID=1L;
	private Integer id;
	private String content;
	private Set<Answer> answers=new HashSet<Answer>(0);
	

	public Question() {
		super();
	}
	
	public Question(String content,Set<Answer>answers) {
		this.content=content;
		this.answers=answers;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" ,unique=true,nullable=false)
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	
	@Column(name = "content",nullable=false)
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content=content;
	}
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy="question")
	public Set<Answer> getAnswer(){
		return this.answers;
	}
	public void setAnswer(Set<Answer> answers) {
		this.answers=answers;
	}
	
	
	}
