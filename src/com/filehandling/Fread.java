package com.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fread {

	public static void main(String[] args) throws IOException {
		File f = new File("./neymar.txt");
		if(!f.exists())
			f.createNewFile();
		FileReader fr = new FileReader(f);
		int a;
		while((a=fr.read())!= -1)
			System.out.print((char)a);
		fr.close();

	}

}
