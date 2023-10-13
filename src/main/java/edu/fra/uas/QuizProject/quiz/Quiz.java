package edu.fra.uas.QuizProject.quiz;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="quiz")
@Component
public class Quiz {
	
    @Id
    @GeneratedValue	
    private Integer id;
	public String quizText;
    public String optionRight;
    public String optionElse1;
    public String optionElse2;
    public String optionElse3;
    
    public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public Quiz(Integer id, String quizText, String optionRight, String optionElse1, String optionElse2,
			String optionElse3) {
		super();
		this.id = id;
		this.quizText = quizText;
		this.optionRight = optionRight;
		this.optionElse1 = optionElse1;
		this.optionElse2 = optionElse2;
		this.optionElse3 = optionElse3;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuizText() {
		return quizText;
	}

	public void setQuizText(String quizText) {
		this.quizText = quizText;
	}

	public String getOptionRight() {
		return optionRight;
	}

	public void setOptionRight(String optionRight) {
		this.optionRight = optionRight;
	}

	public String getOptionElse1() {
		return optionElse1;
	}

	public void setOptionElse1(String optionElse1) {
		this.optionElse1 = optionElse1;
	}

	public String getOptionElse2() {
		return optionElse2;
	}

	public void setOptionElse2(String optionElse2) {
		this.optionElse2 = optionElse2;
	}

	public String getOptionElse3() {
		return optionElse3;
	}

	public void setOptionElse3(String optionElse3) {
		this.optionElse3 = optionElse3;
	}

    
   



}
