package com.basicPrograms;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter 1st value:");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd value:");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd value:");
		int c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+" is Largest");
		else if(b>a && b>c)
			System.out.println(b+" is Largest");
		else
			System.out.println(c+" is Largest");
		sc.close();
	}

}
