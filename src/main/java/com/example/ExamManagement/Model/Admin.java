package com.example.ExamManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	
	@Id
	private String Admin_email;
	private String Admin_pass;
	private String Admin_name;
	
	public String getAdmin_email() {
		return Admin_email;
	}

	public void setAdmin_email(String admin_email) {
		Admin_email = admin_email;
	}

	public String getAdmin_pass() {
		return Admin_pass;
	}

	public void setAdmin_pass(String admin_pass) {
		Admin_pass = admin_pass;
	}

	public String getAdmin_name() {
		return Admin_name;
	}

	public void setAdmin_name(String admin_name) {
		Admin_name = admin_name;
	}

	public Admin() {
		super();
	}

	public Admin(String admin_email, String admin_pass, String admin_name) {
		super();
		Admin_email = admin_email;
		Admin_pass = admin_pass;
		Admin_name = admin_name;
	}
	
}
