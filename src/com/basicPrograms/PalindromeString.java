package com.basicPrograms;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check Palindrome or Not:");
		String s = sc.next();
		String original=s;
		String rev="";
		int len = s.length();
		for(int i=len-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		if(original.equals(rev))
			System.out.println("Its a Palindrome");
		else
			System.out.println("Its Not a Palindrome");
		sc.close();
	}

}
