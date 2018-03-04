package com.gmail.a.zagorodnia;

import java.util.Arrays;

public class SumCount implements Runnable {

	private int[] arr;
	private int threadNumber;
	private int sum;
	

	public SumCount(int[] arr, int threadNumber) {
		super();
		this.arr = arr;
		this.threadNumber = threadNumber;
	}

	public SumCount(int[] arr) {
		super();
		this.arr = arr;
	}

	public SumCount() {
		super();		
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public int getSum() {
		return sum;
	}

	public int countSum(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public void countSum(int n) {
		int p = Runtime.getRuntime().availableProcessors();
		sum = sum + countSum(n * arr.length / p, (n + 1) * arr.length / p - 1);

	}

	@Override
	public String toString() {
		return "SumCount [arr=" + Arrays.toString(arr) + "]";
	}

	@Override
	public void run() {
		countSum(threadNumber);		
	}

}
