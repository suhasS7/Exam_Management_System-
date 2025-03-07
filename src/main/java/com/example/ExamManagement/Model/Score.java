package com.example.ExamManagement.Model;



import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Score {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String email; 
    
    private int score;
    
    private String Result;
    
   
    public Score() {
    }

    public Score(String email, int score,String Result) {
        this.email = email;
        this.score = score;
        this.Result=Result;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getemail() {
        return email;
    }

  

   
	public void setEmail(String email) {
		this.email = email;
	}

	public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", email=" + email +
                ", score=" + score +
                ",Result="+ Result+
                '}';
    }

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}
}
