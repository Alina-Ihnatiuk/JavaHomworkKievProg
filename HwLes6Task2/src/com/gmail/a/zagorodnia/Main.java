package com.gmail.a.zagorodnia;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
			
		int[] arr = new int[250000000];
		Random rn = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rn.nextInt(10);
		}
						
		long start1 = System.currentTimeMillis();
		int sum1 = countSum(arr);
		long finish1 = System.currentTimeMillis();
		System.out.println("SumOne = " + sum1 + " Time result = " + (finish1 - start1));
		
		CreateMultyThreads create = new CreateMultyThreads(arr);
		long start2 = System.currentTimeMillis();
		int sum2 = create.getTotalSum();
		long finish2 = System.currentTimeMillis();
		System.out.println("SumTwo = " + sum2 + " Time result = " + (finish2 - start2));
		
	}	
	
	public static int countSum(int [] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

}
