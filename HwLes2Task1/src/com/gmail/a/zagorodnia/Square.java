package com.gmail.a.zagorodnia;

public class Square extends Shape {

	private Point a;
	private Point b;

	public Square(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;

	}

	public Square() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public double calculatePerimetr() {

		return 4 * getSide();
	}

	@Override
	public double calculateArea() {

		return Math.pow(a.getDistance(b), 2) / 2;
	}

	public double getSide() {

		return Math.sqrt(calculateArea());
	}

	@Override
	public String toString() {
		return "Square [a=" + a + ", b=" + b + "]";
	}

}
