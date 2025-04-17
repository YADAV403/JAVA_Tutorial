package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) throws IOException {
		File f = new File("./neymar.txt");
		if(!f.exists())
			f.createNewFile();
		Scanner scan = new Scanner(f);
		while(scan.hasNext())
			System.out.print(scan.nextLine());
		scan.close();
	}

}
