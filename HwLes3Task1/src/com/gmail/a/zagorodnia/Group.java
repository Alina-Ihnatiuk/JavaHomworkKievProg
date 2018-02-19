package com.gmail.a.zagorodnia;

import java.util.Arrays;

public class Group {

	private Student[] studentsGroupe = new Student[10];
	private int numberOfStudentds = 0;

	public Group() {
		super();
	}
	
	public int getNumberOfStudentds() {
		return numberOfStudentds;
	}

	public void addStudent(Student student) {
		if (student != null) {
			for (int i = 0; i <studentsGroupe.length; i++) {
				if (studentsGroupe[i] == null) {
					studentsGroupe[i] = student;
					numberOfStudentds += 1;
					break;
				}
			}
		}
	}

	public Student searchStudent (String surname) {
		
		for (Student i: studentsGroupe) {
			if (i != null && i.getSurname().equalsIgnoreCase(surname)) {
				return i;
			}
		}
		return null;
	}
	
	public void delStudent (String surname) {
		for (int i = 0; i < studentsGroupe.length; i++) {
			if (studentsGroupe[i] != null && studentsGroupe[i].getSurname().equalsIgnoreCase(surname)) {
				studentsGroupe[i] = null;
				numberOfStudentds -= 1;
				break;
			}
		}	
	}
	
	public void sortGroupBySurname () {
		
		for (int i = 0; i < studentsGroupe.length; i++) {
			
			for (int j= i+1; j < studentsGroupe.length; j++) {
				
				if (getIntForSort (studentsGroupe[i], studentsGroupe[j]) > 0) {
					
					Student temp = studentsGroupe[i];
					studentsGroupe[i] = studentsGroupe[j];
					studentsGroupe[j] = temp;
				}
			}
		}
	}
	
	private int getIntForSort (Student a, Student b) {
		if (a == null) {
			return 1;
		}
		if (b == null) {
			return -1;
		}		
		if (a == null & b == null) {
			return 0;
		}
		
		return a.getSurname().compareTo(b.getSurname());
	}

	@Override
	public String toString() {
		sortGroupBySurname ();
		return "Group [studentsGroupe=" + Arrays.toString(studentsGroupe) + "]";
	}
	
	
}
