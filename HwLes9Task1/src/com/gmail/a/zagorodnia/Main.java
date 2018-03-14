package com.gmail.a.zagorodnia;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		listOperation();

	}

	public static void listOperation() {

		List<String> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myList.add(String.format("%." + (i+2) + "f", Math.PI));
		}  
		myList.remove(0);
        myList.remove(0);
        myList.remove(myList.size() - 1);
        System.out.println(myList);
		
		
	}
}
