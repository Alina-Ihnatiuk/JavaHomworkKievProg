package com.gmail.a.zagorodnia;

import java.util.Arrays;

public class Board {
	
	private Shape [] arr = new Shape [4];
	
	public Board() {
		super();	
	}

	public void putShape (Shape a, int i) {
		
		if (i >= 0 && i < arr.length && arr[i] == null) {
			arr[i] = a;
		} 
	}
	public void delShape (int i) {
		if (i >= 0 && i < arr.length)  {
			arr[i] = null;
		} 
	}
	
	public double sumArea() {
		double sum = 0; 
		for (Shape i: arr) {
			if (i != null) {
				sum += i.calculateArea();
			}
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return "Board [arr=" + Arrays.toString(arr) + ", " + "sum area = " + sumArea() + "]";
	}
	
	
	
	
	

}
