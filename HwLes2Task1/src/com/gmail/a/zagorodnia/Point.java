package com.gmail.a.zagorodnia;

public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getDistance (Point b) {
		
		return Math.sqrt(Math.pow((b.x - x), 2) + Math.pow((b.y - y), 2)); 
		
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	 
	

}
