package com.gmail.a.zagorodnia;

public class Main {

	public static void main(String[] args) {
		
		Network globalNetwork = new Network();
		
		System.out.println(globalNetwork);
		
		Phone ph1 = new Phone(5558120);
		Phone ph2 = new Phone(5558121);
		Phone ph3 = new Phone(5558122);
				
		ph1.registerInNetwork(globalNetwork);
		ph2.registerInNetwork(globalNetwork);
		
		System.out.println(globalNetwork);
		
		ph1.makeCall(5558122);
		ph3.makeCall(5558121);
		ph2.makeCall(5558121);
		ph1.makeCall(5558121);	
				
	}

}
