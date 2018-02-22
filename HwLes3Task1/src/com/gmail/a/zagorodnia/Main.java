package com.gmail.a.zagorodnia;

import java.util.Arrays;

import javax.sound.midi.Synthesizer;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Vasil", "Ivanov", Gender.MALE, 18, Faculty.BANKING, 82, 123);
		Student s2 = new Student("Igor", "Zubov", Gender.MALE, 27, Faculty.BANKING, 69, 1234);
		Student s3 = new Student("Maria", "Yakovleva", Gender.FEMALE, 18, Faculty.BANKING, 75.5, 12345);
		Student s4 = new Student("Mihail", "Petrov", Gender.MALE, 17, Faculty.BANKING, 64, 123456);
		Student s5 = new Student("Anna", "Pelevina", Gender.FEMALE, 16, Faculty.BANKING, 94.5, 1234567);
		Student s6 = new Student("Irina", "Azina", Gender.FEMALE, 21, Faculty.BANKING, 80.5, 12345678);
		Student s7 = new Student("Marina", "Urda", Gender.FEMALE, 20, Faculty.BANKING, 85, 123456789);
		Student s8 = new Student("Dmitrii", "Yogun", Gender.MALE, 22, Faculty.BANKING, 85, 123456789);
		Student s9 = new Student("Alex", "Portnoi", Gender.MALE, 26, Faculty.BANKING, 74, 1234567890);
		Student s10 = new Student("Olga", "Kuzmina", Gender.FEMALE, 23, Faculty.BANKING, 68, 12345678901L);
		
		Student s11 = new Student("Ivan", "Nevskiy", Gender.MALE, 21, Faculty.BANKING, 56, 12345678902L);
		
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
//			groupOne.addStudent(s11);
		} catch (TooMuchStudentsException e) {
			
			System.out.println(e.getMessage());	
		}
		
		
		System.out.println("Recruits:");
		
		System.out.println(Arrays.toString(groupOne.getRecruits()));
		
		System.out.println();
		
		groupOne.delStudent(123);
		
		groupOne.addStudentInteract();
		
		System.out.println(groupOne);
		
		System.out.println("SortType by SURNAME:");
		
		groupOne.sortWithParameters(SortType.SURNAME);
		
		System.out.println(groupOne);
		
		System.out.println("SortType by AGE:");
		
		groupOne.sortWithParameters(SortType.AGE);
		
		System.out.println(groupOne);
		
		
		
		
			
		
		
	}
	

}
