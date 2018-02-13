package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {

		Point pOne = new Point(4, 2);

		Point pTwo = new Point(10, 8);

		Point pThree = new Point(10, 2);

		System.out.println("Point distance 1 = " + pOne.getDistance(pTwo));
		System.out.println("Point distance 2 = " + pTwo.getDistance(pThree));
		System.out.println("Point distance 3 = " + pOne.getDistance(pThree));

		Circle c = new Circle(pOne, pTwo);

		System.out.println("Circle's perimeter = " + c.calculatePerimetr());
		System.out.println("Circle's area = " + c.calculateArea());

		Triangle t = new Triangle(pOne, pTwo, pThree);

		System.out.println("Triangle's perimeter = " + t.calculatePerimetr());
		System.out.println("Triangle's area = " + t.calculateArea());

		Square s = new Square(pOne, pTwo);

		System.out.println("Square's side = " + s.getSide());
		System.out.println("Square's perimeter = " + s.calculatePerimetr());
		System.out.println("Square's area = " + s.calculateArea());
		
		Board b = new Board();
		
		System.out.println(b);
		
		b.putShape(t, 2);
		b.putShape(c, 0);
		b.putShape(s, 3);
		
		System.out.println(b);
		
		b.delShape(2);
		
		System.out.println(b);	

	}

}
