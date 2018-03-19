package com.gmail.a.zagorodnia;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File dictionary = new File("./src/com/gmail/a/zagorodnia/Dictionary.txt");
		MyDictionary myDictionary = new MyDictionary(dictionary);
        
        File in = new File("./src/com/gmail/a/zagorodnia/English.in.txt");
        File out = new File("./src/com/gmail/a/zagorodnia/Ukrainian.out.txt");

        try {
            myDictionary.addToDictionary("Thanks!", "Дякую!", dictionary);
        } catch (IOException e) {
            e.printStackTrace();
        }
                 
        try {
            myDictionary.translateFile(in, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
	}

}
