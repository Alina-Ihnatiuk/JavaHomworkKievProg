package com.gmail.a.zagorodnia;

public class Human {
	private String name;
	private String surname;
	private Gender humansGender;
	private int age;
	public Human(String name, String surname, Gender humansGender, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.humansGender = humansGender;
		this.age = age;
	}
	public Human() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Gender getHumansGender() {
		return humansGender;
	}
	public void setHumansGender(Gender humansGender) {
		this.humansGender = humansGender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", surname=" + surname + ", humansGender=" + humansGender + ", age=" + age + ", ";
	}
	
	
}
