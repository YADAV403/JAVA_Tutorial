package com.basicPrograms;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence to count Number of words:");
		String s = sc.nextLine();

		String[] w = s.split(" ");
		System.out.println(w.length);

//		int count = 1;
//		for(int i=0; i<s.length()-1; i++) {
//			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
//				count++;
//			}
//		}
//		System.out.println("Number of Words = "+count);
	}
}
