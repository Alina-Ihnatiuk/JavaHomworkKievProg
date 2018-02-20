package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Vasil", "Ivanov", Gender.MALE, 20, Faculty.BANKING, 82, 123);
		Student s2 = new Student("Igor", "Zubov", Gender.MALE, 21, Faculty.BANKING, 68, 1234);
		Student s3 = new Student("Maria", "Yakovleva", Gender.FEMALE, 21, Faculty.BANKING, 75.5, 12345);
		Student s4 = new Student("Mihail", "Petrov", Gender.MALE, 20, Faculty.BANKING, 64, 123456);
		Student s5 = new Student("Anna", "Pelevina", Gender.FEMALE, 20, Faculty.BANKING, 94.5, 1234567);
		Student s6 = new Student("Irina", "Kozina", Gender.FEMALE, 21, Faculty.BANKING, 80.5, 12345678);
		Student s7 = new Student("Marina", "Urda", Gender.FEMALE, 20, Faculty.BANKING, 85, 123456789);
		Student s8 = new Student("Dmitrii", "Bogun", Gender.MALE, 20, Faculty.BANKING, 85, 123456789);
		Student s9 = new Student("Alex", "Portnoi", Gender.MALE, 20, Faculty.BANKING, 74, 1234567890);
		Student s10 = new Student("Olga", "Kuzmina", Gender.FEMALE, 20, Faculty.BANKING, 68, 12345678901L);
		Student s11 = new Student("Ivan", "Neuch", Gender.MALE, 21, Faculty.BANKING, 56, 12345678902L);
		
		Group groupOne = new Group();
		
		try {
			groupOne.addStudent(s1);
			groupOne.addStudent(s2);
			groupOne.addStudent(s3);
			groupOne.addStudent(s4);
			groupOne.addStudent(s5);
			groupOne.addStudent(s6);
			groupOne.addStudent(s7);
			groupOne.addStudent(s8);
			groupOne.addStudent(s9);
			groupOne.addStudent(s10);
			groupOne.addStudent(s11);
		} catch (TooMuchStudentsException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println(groupOne.getNumberOfStudentds());
		
		System.out.println(groupOne.searchStudent("Petrov"));
		
		groupOne.delStudent(123456);
		
		System.out.println(groupOne.getNumberOfStudentds());
		
		System.out.println(groupOne);
		
		try {
			groupOne.addStudent(null);
		} catch (TooMuchStudentsException e) {
			e.printStackTrace();
		}
	}
	

}
