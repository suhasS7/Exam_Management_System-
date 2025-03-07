package com.example.ExamManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamManagement.Bo.UserBo;
import com.example.ExamManagement.Model.User;
//import com.tm.movieapp.model.Movie;





@Service
public class UserService {
			
	@Autowired
	UserBo ub;
	
	public boolean insertUser(User m) {
		boolean b=false;
		try {
		ub.save(m);
		}
		catch(Exception e) {
			b=true;
		}
		return b;
	}
	
	public List<User> getAllUser(){
		return ub.findAll();
	}

	  public User getUserById(String email) {
	        return ub.getById(email);
	    }
	
	public User getUserByEmail(String email) {
		return ub.findByEmail(email);
	}
	public boolean updateUser(User m) {
		boolean b=false;
		try {
		ub.save(m);
		}
		catch(Exception e) {
			b=true;
		}
		return b;
	}

	


	
}
