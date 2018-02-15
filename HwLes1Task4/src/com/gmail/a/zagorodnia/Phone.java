package com.gmail.a.zagorodnia;

public class Phone {

	private int phoneNumber;
	private Network network;

	public Phone(int phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public Phone() {
		super();

	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void registerInNetwork(Network network) {
		this.network = network;
		network.addNew(this);
	}

	public void makeCall(int recipientNumber) {
		if (network != null && network.findNumber(recipientNumber) && phoneNumber != recipientNumber) {
			System.out.println("Calling...");
			network.connectPhones(phoneNumber, recipientNumber);
		} else {
			System.out.println("You can't make this call");
		}

	}

	public void receiveIncomingCall(int callersNumber) {
		System.out.println(callersNumber + " is calling");

	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + "]";
	}

}
