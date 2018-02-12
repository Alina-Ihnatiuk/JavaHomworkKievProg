package com.gmail.a.zagorodnia;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	boolean ifIsTriangle;
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public Triangle() {
		super();
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	public boolean checkTriangle () {
		if (sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideB + sideA)) {
			ifIsTriangle = true;			
		}
		return ifIsTriangle;
	}
	public double trianglesArea() {
		double area;
		if (checkTriangle()) {
			double p = (sideA + sideB + sideC) / 2;
			area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
			return area;
		} else {
			area = 0;
		}
		return area;
	}
	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}
	
}
