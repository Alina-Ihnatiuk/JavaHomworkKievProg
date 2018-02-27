package com.gmail.a.zagorodnia;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		MyFileFilter mFF = new MyFileFilter("pdf");
		
		File folder = new File("D:/MyFolder");
		
		File[] fileList = folder.listFiles(mFF);
			
		try {
			for (File file : fileList) {
				CopyFile.copyFile(file, new File ("D:/CopyMyFolder/" + file.getName()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
