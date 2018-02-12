package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
		
		Cat masha = new Cat("Masha", 9, 3.5, "black");
		Cat lusi = new Cat("Lusi", 2, 2.5, "red");
		
		lusi.makeSound();
		masha.makeSound();
		
		lusi.eat();
		
		masha.play();
		lusi.play();
		
		lusi.makeSound();
		
		System.out.println(masha.getAge());
		masha.selebrateBirthday();
		System.out.println(masha.getAge());
		
		System.out.println(lusi);
		System.out.println(masha);
	}

}
