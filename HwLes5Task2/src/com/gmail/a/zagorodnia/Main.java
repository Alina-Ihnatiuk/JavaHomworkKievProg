package com.gmail.a.zagorodnia;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File fileOne = new File("D:/MyFolder/doc.txt");
		File fileTwo = new File("D:/MyFolder/doc2.txt");
		File fileThree = new File("D:/MyFolder/doc3.txt");
		
		TextOperation t = new TextOperation();
		
		t.writeFromTwoToOne(fileOne, fileTwo, fileThree);
	}

}
