package com.gmail.a.zagorodnia;

public class Cat {
	
	private String name;
	private int age;
	private double weight;
	private String color;
	private boolean isHungry = true;
	private boolean isHappy = false;
	
	public Cat(String name, int age, double weight, String color) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	public Cat() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isHungry() {
		return isHungry;
	}
	public boolean isHappy() {
		return isHappy;
	}
	public void eat() {
		System.out.println("omnomnomnom");
		isHungry = false;
	}
	public void makeSound() {
		if (isHappy) {
			System.out.println("Murrrr-murrrr-murrrrr");
		} else { 
			System.out.println("Meoooooooow!!!");
		}	
	}
	public void play() {	
		if (isHungry) {
			System.out.println("Noooo!");
		} else { 
			System.out.println("Lets play!");
			isHappy = true;
		}	
	}
	public void selebrateBirthday() {
		System.out.println("Happy Birthday " + name + " !!!" );
		age = age + 1;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + ", color=" + color + ", isHungry="
				+ isHungry + ", isHappy=" + isHappy + "]";
	}
	
	
}
