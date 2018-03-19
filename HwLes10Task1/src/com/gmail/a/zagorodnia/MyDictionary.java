package com.gmail.a.zagorodnia;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyDictionary {

	private Map<String, String> dictionary;

	public MyDictionary(File file) {

		try {
			this.dictionary = listToMap(fileToStrings(file));
		} catch (IOException e) {
			e.printStackTrace();
			this.dictionary = new HashMap<>();
		}
	}

	public MyDictionary() {
		this.dictionary = new HashMap<>();
	}

	public Map<String, String> getDictionary() {
		return dictionary;
	}

	public List<String> fileToStrings(File file) throws IOException {
		List<String> linesList = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String s;
			for (; (s = reader.readLine()) != null;) {
				linesList.add(s);
			}
		}
		return linesList;
	}

	public void stringsToFile(List<String> list, File file) throws FileNotFoundException {
		if (list == null) {
			throw new IllegalArgumentException();
		}
		try (PrintWriter printWriter = new PrintWriter(file)) {
			for (String string : list) {
				printWriter.println(string);
			}
		}
	}

	public Map<String, String> listToMap(List<String> list) {
		Map<String, String> map = new HashMap<>();
		for (String line : list) {
			map.put(line.split(" - ")[0], line.split(" - ")[1]);
		}
		return map;
	}	
	
	public List<String> translateStringList(List<String> inEnglish) {
		List<String> result = new ArrayList<>();
		for (String string : inEnglish) {
			result.add(this.translateString(string));
		}
		return result;
	}
		
	public String translateString(String inEnglish) {
		String[] wordsInEnglish = inEnglish.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < wordsInEnglish.length; i++) {
			if (this.dictionary.containsKey(wordsInEnglish[i])) {
				result.append(this.dictionary.get(wordsInEnglish[i]));
				result.append(" ");
			} else {
				result.append(wordsInEnglish[i]);
				result.append(" ");
			}
		}
		return result.toString();
	}
		
	public void translateFile(File in, File out) throws IOException {
		List<String> linesIn = fileToStrings(in);
		List<String> resultList = translateStringList(linesIn);
		stringsToFile(resultList, out);
	}
	
	public void addToDictionary (String inEnglish, String inUkrainian, File file) throws IOException {
		this.dictionary.put(inEnglish, inUkrainian);
		this.addToDictionaryFile(inEnglish + " - " + inUkrainian, file);
	}

	public void addToDictionaryFile(String line, File file) throws IOException {
		try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))) {
			bf.write(System.lineSeparator());
			bf.write(line);	
		}				
	}

	@Override
	public String toString() {
		return "Dictionary{" + "words=" + dictionary + '}';
	}

}
