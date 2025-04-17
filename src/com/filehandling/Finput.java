package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Finput {
	public static void main(String[] args) throws IOException {
		File f = new File("./neymar.txt");
		if(!f.exists())
			f.createNewFile();
		FileInputStream fi = new FileInputStream(f);
		int a;
		while((a=fi.read()) != -1)
		System.out.print((char)a);
		fi.close();
		}

}
