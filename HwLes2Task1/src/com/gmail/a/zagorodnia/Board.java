package com.gmail.a.zagorodnia;

import java.util.Arrays;

public class Board {
	
	private Shape [] arr = new Shape [4];
	
	public Board() {
		super();	
	}

	public Shape [] putShape (Shape a, int i) {
		
		if (arr[i] == null) {
			arr[i] = a;
		}
		return arr;
	}
	public Shape [] delShape (int i) {
		
			arr[i] = null;
		
		return arr;
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
