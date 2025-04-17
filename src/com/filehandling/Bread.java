package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Bread {
	public static void main(String[] args) throws IOException {
		File f = new File("./neymar.txt");
		if(!f.exists())
			f.createNewFile();
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		fr.close();
		br.close();
		
	}

}
