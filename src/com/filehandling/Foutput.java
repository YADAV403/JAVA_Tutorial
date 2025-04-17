package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Foutput {
	public static void main(String[] args) throws IOException {
		File f = new File("./messi.txt");
		if(!f.exists())
			f.createNewFile();
		
		String s = "hi, i am leo messi";
		FileOutputStream fo = new FileOutputStream(f);
		for (char ch: s.toCharArray()) {
			fo.write(ch);	
		}
		fo.close();
		
	}

}
