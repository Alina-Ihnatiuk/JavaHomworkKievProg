package com.gmail.a.zagorodnia;

import java.util.Arrays;

public class Network {
	
	Phone [] phoneList = new Phone [0];

	public Network() {
		super();

	}
	
	public boolean findNumber (int phoneNumber) {
		boolean check = false;
		for (Phone i: phoneList) {
			if (i.getPhoneNumber() == phoneNumber) {
				check = true;
				break;
			} 	
		}
		return check;
	}
	
	public void addNew (Phone phone) {
		if (findNumber(phone.getPhoneNumber()) == false) {
			Phone [] newList = Arrays.copyOf(phoneList, phoneList.length+1);
			newList [newList.length-1] = phone;
			phoneList = newList;
		}
	}
	
	public void connectPhones(int callersNumber, int recipientNumber) {
		Phone recipientPhone = null;
		for (Phone i: phoneList) {
			if (i.getPhoneNumber() == recipientNumber) {
				recipientPhone = i;
				break;
			}
		}
		recipientPhone.receiveIncomingCall(callersNumber);
	}	
	
	@Override
	public String toString() {
		return "Network [phoneList=" + Arrays.toString(phoneList) + "]";
	}	

}
