package com.gmail.a.zagorodnia;

public class Student extends Human implements Comparable {
	
	private Faculty faculty;
	private double averageScore;
	private long studentRecordBookNum;
	
	
	public Student(String name, String surname, Gender humansGender, int age, Faculty faculty, 
				double averageScore, long studentRecordBookNum) {
		super(name, surname, humansGender, age);
		this.faculty = faculty;
		this.averageScore = averageScore;
		this.studentRecordBookNum = studentRecordBookNum;
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

	public long getStudentRecordBookNum() {
		return studentRecordBookNum;
	}

	public void setStudentRecordBookNum(long studentRecordBookNum) {
		this.studentRecordBookNum = studentRecordBookNum;
	}
				
	@Override
	public int compareTo(Object o) {
		
		Student anotherStudent = (Student) o;
			
		return this.getSurname().compareTo(anotherStudent.getSurname()); 
				
	}	

	@Override
	public String toString() {
		return "Student [" + super.toString() + "faculty=" + faculty + ", averageScore=" + averageScore + ", studentRecordBookNum="
				+ studentRecordBookNum + "]";
	}

	
	
	
	

	
	
	
	
	
	
	

}
