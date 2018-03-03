package com.gmail.a.zagorodnia;

import java.math.BigInteger;

public class FactorialCount implements Runnable {
	
	private int number;

	public FactorialCount(int number) {
		super();
		this.number = number;
	}

	public FactorialCount() {
		super();
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "FactorialTask [number=" + number + "]";
	}

	@Override
	public void run() {
		
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + " " + number + " ! = " + calculateFactorial(number));

	}

	private BigInteger calculateFactorial(int n) {

		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}
	
}
