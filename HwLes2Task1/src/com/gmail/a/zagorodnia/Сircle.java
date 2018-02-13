package com.gmail.a.zagorodnia;

public class Ñircle extends Shape {

	private Point center;
	private Point circumPoint;

	public Ñircle(Point center, Point circumPoint) {
		super();
		this.center = center;
		this.circumPoint = circumPoint;
	}

	public Ñircle() {
		super();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getCircumPoint() {
		return circumPoint;
	}

	public void setCircumPoint(Point circumPoint) {
		this.circumPoint = circumPoint;
	}

	@Override
	public double calculatePerimetr() {

		return 2 * Math.PI * center.getDistance(circumPoint);
	}

	@Override
	public double calculateArea() {

		return Math.PI * Math.pow(center.getDistance(circumPoint), 2);
	}

	@Override
	public String toString() {
		return "Ñircle [center=" + center + ", circumPoint=" + circumPoint + "]";
	}

}
