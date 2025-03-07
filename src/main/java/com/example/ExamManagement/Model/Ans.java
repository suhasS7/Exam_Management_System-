package com.example.ExamManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ans {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int ansid;
	private int ans;
	
	
	
	
	
	public int getAnsid() {
		return ansid;
	}





	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}





	public int getAns() {
		return ans;
	}





	public void setAns(int ans) {
		this.ans = ans;
	}





	public Ans() {
		super();
	}





	public Ans(int ansid, int ans) {
		super();
		this.ansid = ansid;
		this.ans = ans;
	}





	@Override
	public String toString() {
		return "JavaAns [ansid=" + ansid + ", ans=" + ans + "]";
	}
	
	
	
}
