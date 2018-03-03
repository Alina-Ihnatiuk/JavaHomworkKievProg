package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
	
		Thread[] threadArray = new Thread[100];

		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new Thread(new FactorialCount(i));
			threadArray[i].start();		
		}	
	}

}
