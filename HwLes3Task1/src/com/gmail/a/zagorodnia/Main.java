package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Vasil", "Ivanov", Gender.MALE, 20, Faculty.BANKING, 82);
		Student s2 = new Student("Igor", "Zubov", Gender.MALE, 21, Faculty.BANKING, 68);
		Student s3 = new Student("Maria", "Yakovleva", Gender.FEMALE, 21, Faculty.BANKING, 75.5);
		Student s4 = new Student("Mihail", "Petrov", Gender.MALE, 20, Faculty.BANKING, 64);
		Student s5 = new Student("Anna", "Pelevina", Gender.FEMALE, 20, Faculty.BANKING, 94.5);
		
		System.out.println(s1);
		
		Group groupOne = new Group();
		
		groupOne.addStudent(s1);
		groupOne.addStudent(s2);
		groupOne.addStudent(s3);
		groupOne.addStudent(s4);
		groupOne.addStudent(s5);
				
		System.out.println(groupOne);
		System.out.println(groupOne.getNumberOfStudentds());
		
		groupOne.delStudent("Ivanov");
		
		System.out.println(groupOne);
		System.out.println(groupOne.getNumberOfStudentds());
		
		
		groupOne.sortGroupBySurname();
		
		System.out.println(groupOne);
		
		

	}
	

}
