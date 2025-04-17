package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fwrite {
	public static void main(String[] args) throws IOException {
		File f = new File("./messi.txt");
		if(!f.exists())
			f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		String s = "hi, i am cristinao";
		for (char c : s.toCharArray()) {
			fw.write(c);	
		}
		fw.close();
	}

}
