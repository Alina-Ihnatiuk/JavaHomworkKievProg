package com.gmail.a.zagorodnia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextOperation {
	
	public void writeFromTwoToOne(File fileOne, File fileTwo, File fileThree) {
    	String result = findEqualWords(textToWordsArr(fileOne), textToWordsArr(fileTwo));
        if (result != null) {
            try (PrintWriter printWriter = new PrintWriter(fileThree)) {
                printWriter.println(result);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    
    public String [] textToWordsArr (File file) {
		StringBuilder result = new StringBuilder();
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String s;
			for (;(s = reader.readLine()) != null;) {
				result.append(s).append(" ");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		return result.toString().split("[\\s,.!]+");
	}
	
	public String findEqualWords(String[] arr1, String[] arr2){
		StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i].equals(arr2[j]) && !checkWordInArr(arr1[i], result.toString().split("[ ]"))){
                    result.append(arr1[i]).append(" ");
                }
            }
        }
        return result.toString();
    }
	
	public boolean checkWordInArr(String word, String[] arr) {
        for (String wordFromArr : arr) {
            if (wordFromArr.equals(word)) {
                return true;
            }
        }
        return false; 
	}
	
}
