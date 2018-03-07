package com.gmail.a.zagorodnia;

public class CreateMultyThreads {

	private int[] arr;
	private int p = Runtime.getRuntime().availableProcessors();

	public CreateMultyThreads(int[] arr) {
		super();
		this.arr = arr;
	}

	public CreateMultyThreads() {
		super();
	}

	public SumCount[] getSumsArray() {

		Thread[] threadArray = new Thread[p];
		SumCount[] sumsArray = new SumCount[p];
		for (int i = 0; i < threadArray.length; i++) {
			sumsArray[i] = new SumCount(arr, i);
			threadArray[i] = new Thread(sumsArray[i]);
			threadArray[i].start();
		}
		try {

			for (Thread thread : threadArray) {
				thread.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return sumsArray;
	}

	public int getTotalSum() {
		int totalSum = 0;
		for (SumCount sumCount : getSumsArray()) {
			totalSum += sumCount.getSum();
		}
		return totalSum;
	}

}
