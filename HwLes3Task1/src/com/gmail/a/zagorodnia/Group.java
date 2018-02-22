package com.gmail.a.zagorodnia;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Group implements Voenkom {

	private Student[] studentsGroupe = new Student[10];
	private int numberOfStudentds;

	public Group() {
		super();
	}

	public int getNumberOfStudentds() {
		return numberOfStudentds;
	}

	public void addStudent(Student student) throws TooMuchStudentsException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}
		for (int i = 0; i < studentsGroupe.length; i++) {
			if (studentsGroupe[i] == null) {
				studentsGroupe[i] = student;
				numberOfStudentds += 1;
				return;
			}
		}
		throw new TooMuchStudentsException();
	}
	
	
	public void addStudentInteract () throws IllegalArgumentException {
	
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input Name:");
			String name =sc.nextLine();
			System.out.println("InputSurname:");
			String surname = sc.nextLine();
			System.out.println("Input Gender:");
			Gender HumansGender = Gender.valueOf(Gender.class, sc.next());
			System.out.println("Input Age:");
			int age = sc.nextInt();
			System.out.println("Input Faculty:");
			Faculty faculty = Faculty.valueOf(Faculty.class, sc.next());
			System.out.println("Input Average Score:");
			double averageScore = sc.nextDouble();
			System.out.println("Input Record's Book Number:");
			long number = sc.nextLong();
			Student student = new Student(name, surname, HumansGender, age, faculty, averageScore, number);
			try {
				this.addStudent(student);
			} catch (TooMuchStudentsException e) {
				e.getMessage();
			}
		} catch (IllegalArgumentException | InputMismatchException e) {
			
			System.out.println("WRONG INPUT. Please try again");
		}
		
	}
	
	public Student searchStudent(String surname) {

		for (Student i : studentsGroupe) {
			if (i != null && i.getSurname().equalsIgnoreCase(surname)) {
				return i;
			}
		}
		return null;
	}

	public void delStudent(long studentRecordBookNum) {
		for (int i = 0; i < studentsGroupe.length; i++) {
			if (studentsGroupe[i] != null && studentsGroupe[i].getStudentRecordBookNum() == studentRecordBookNum) {
				studentsGroupe[i] = null;
				numberOfStudentds -= 1;
				break;
			}
		}
	}

	public void sortGroupBySurname() {
		for (int i = 0; i < studentsGroupe.length; i++) {
			for (int j = i + 1; j < studentsGroupe.length; j++) {
				
				if (getIntForSort (studentsGroupe[i], studentsGroupe[j]) > 0) {
					Student temp = studentsGroupe[i];
					studentsGroupe[i] = studentsGroupe[j];
					studentsGroupe[j] = temp;				
				}
			}
		}
	}
		

	private int getIntForSort(Student a, Student b) {
		if (a == null && b == null) {
			return 0;
		}
		if (a == null) {
			return 1;
		}
		if (b == null) {
			return -1;
		}
		return a.getSurname().compareTo(b.getSurname());
	}

	public int studentsUnderEighteen() {
		int n = 0;
		for (Student student : studentsGroupe) {
			if (student != null && student.getAge() >= 18 && student.getHumansGender() == Gender.MALE) {
				n += 1;
			}
		}
		return n;
	}


	@Override
	public Student[] getRecruits() {
		Student[] voenkomRecruits = new Student[studentsUnderEighteen()];
		int j = 0;
		for (int i = 0; i < studentsGroupe.length; i++) {
			if (studentsGroupe[i] != null && studentsGroupe[i].getAge() >= 18 &&
				 studentsGroupe[i].getHumansGender() == Gender.MALE) {
				 voenkomRecruits[j++] = studentsGroupe[i];	 
			}
		}

		return voenkomRecruits;
	}
	
	public void sortWithParameters(SortType sortType) {
        Arrays.sort(studentsGroupe, new StudentsComparator(sortType));
    }
	

	@Override
	public String toString() {
//		this.sortGroupBySurname();
		StringBuilder sb = new StringBuilder();
		for (Student student : studentsGroupe) {
			if (student != null) {
				sb.append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

}
