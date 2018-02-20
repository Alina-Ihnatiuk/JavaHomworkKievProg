package com.gmail.a.zagorodnia;

public class TooMuchStudentsException extends Exception {

	@Override
	public String getMessage() {
		
		return "Can't add more then ten";
	}

}
