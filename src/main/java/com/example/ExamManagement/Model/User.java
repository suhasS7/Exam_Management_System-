
package com.example.ExamManagement.Model;
 
import java.util.Arrays;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
 
@Entity
public class User {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	 @OneToOne(cascade=CascadeType.ALL)
	private String email;
	private String first_name;
	private String last_name;
	private String password;
	private String gender;
	private String userType;
	
	



	








	public User() {
		super();
	}



	



	
	public User(String email, String first_name, String last_name, String password, String gender, String userType) {
		super();
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.gender = gender;
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User email=" + email + ", First_name=" + first_name +"Last_name="+ last_name + ", password=" + password + ""
				+ ", gender=" + gender + ", userType=" + userType ;
	}
	
	
 
}
 