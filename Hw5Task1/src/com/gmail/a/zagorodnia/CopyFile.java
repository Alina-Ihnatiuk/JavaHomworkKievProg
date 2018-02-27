package com.gmail.a.zagorodnia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {
	
public static void copyFile(File in, File out) throws IOException {
		
		if (in == null || out == null) {
			throw new IllegalArgumentException("File pointer null");
		}
		try(InputStream is = new FileInputStream(in);
				OutputStream os = new FileOutputStream(out)) {
			byte [] buffer = new byte [1024*1024];
			int byteRead = 0;
			
			for (; (byteRead=is.read(buffer)) >0;) {
				os.write(buffer, 0, byteRead);
			}
			
		} catch (IOException e) {
			throw e;
		}
		
	}

}
