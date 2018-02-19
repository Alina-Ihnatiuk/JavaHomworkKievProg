package com.gmail.a.zagorodnia;

public class Student extends Human {
	
	private Faculty faculty;
	private double averageScore;
	
	
	public Student(String name, String surname, Gender humansGender, int age, Faculty faculty, double averageScore) {
		super(name, surname, humansGender, age);
		this.faculty = faculty;
		this.averageScore = averageScore;
	}

	public Student() {
		
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + "faculty=" + faculty + ", averageScore=" + averageScore + "]";
	}

	
	
	

	
	
	
	
	
	
	

}
