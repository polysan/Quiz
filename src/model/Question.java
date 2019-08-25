package model;

import java.io.Serializable;

public class Question implements Serializable {
	private String answer1;
	private String answer2;

	public Question() {	}
	public Question(String answer1) {
		this.answer1 = answer1;
	}
	public Question(String answer1, String answer2) {
		this.answer1 = answer1;
		this.answer2 = answer2;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
}
