package com.basicPrograms;

import java.util.Scanner;

public class UpperToLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a senstence: ");
		String s = sc.nextLine(); // I am PrasAnTH fRom HydeRaBaD
		char C[] = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(char c:C) {
			if(Character.isUpperCase(c))
				sb.append(Character.toLowerCase(c));
			else
				sb.append(c);
		}
		
		System.out.println(s);
		System.out.println(sb);
		sc.close();
	}
	
}