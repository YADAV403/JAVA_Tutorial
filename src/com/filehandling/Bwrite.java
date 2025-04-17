package com.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bwrite {
	public static void main(String[] args) throws IOException {
		File f = new File("./messi.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		
		String s = "hi, i am virat";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(s);
		bw.close();
		
	}

}
