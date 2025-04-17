package com.basicPrograms;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			num = num/10;
			count+=1;
		}
		System.out.println(count);		
		sc.close();
	}

}
