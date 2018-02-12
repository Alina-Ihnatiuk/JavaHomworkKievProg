package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
	
		Triangle tOne = new Triangle();
		
		tOne.setSideA(12);
		tOne.setSideB(10.8);
		tOne.setSideC(20.4);
		
		Triangle tTwo = new Triangle(18, 34, 51.5);
		
		Triangle tThree = new Triangle(11.44, 18.52, 37.18);
	
		System.out.println(tOne.trianglesArea());
		System.out.println(String.format("%.2f", tTwo.trianglesArea()));
		
		System.out.println(tThree.trianglesArea());
		System.out.println(tThree.checkTriangle());
		
	}

}
