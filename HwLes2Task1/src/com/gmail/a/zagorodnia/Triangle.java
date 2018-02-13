package com.gmail.a.zagorodnia;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double calculatePerimetr() {

		return a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
		
	}

	@Override
	double calculateArea() {

		double halfP = calculatePerimetr() / 2;
		return Math.sqrt(halfP * (halfP - a.getDistance(b)) * (halfP - b.getDistance(c)) * (halfP - c.getDistance(a)));
		
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
