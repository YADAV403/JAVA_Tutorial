package com.basicPrograms;

import java.util.Scanner;

public class ReversingString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.nextLine();
//		Using Character Array
		int len = s.length();
		for(int i=len-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		
//		Using StringBuffer
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
		sc.close();
		
	}

}
