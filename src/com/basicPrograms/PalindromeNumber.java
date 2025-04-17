package com.basicPrograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check Palindrome or Not:");
		int num = sc.nextInt();
		int original = num;
		int temp,rev=0;
		while(num>0) {
			temp = num%10;
			rev = (rev*10)+temp;
			num = num/10;
		}
		if(original==rev) 
			System.out.println("Its a Palindrome");
		else
			System.out.println("Not a Palindrome");
		sc.close();
	}

}
