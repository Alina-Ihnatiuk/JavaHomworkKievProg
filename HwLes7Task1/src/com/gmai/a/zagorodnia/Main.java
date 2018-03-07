package com.gmai.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
		
		Dock dockOne = new Dock("dockOne");
		Dock dockTwo = new Dock("dockTwo");
				
		Dock [] port = {dockOne, dockTwo};
		
		Ship one = new Ship("A", 10, port);
		Ship two = new Ship("B", 10, port);
		Ship three = new Ship("C", 10, port);
								
		Thread o = new Thread(one);
		Thread t = new Thread(two);
		Thread th = new Thread(three);
				
		o.start();
		System.out.println("Ship A arrived");
		t.start();
		System.out.println("Ship B arrived");
		th.start();
		System.out.println("Ship C arrived");
		
		
		

	}

}
