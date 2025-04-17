package com.basicPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to find its Factorial:");
		int num = sc.nextInt();
		int fact = 1;
//		5*4*3*2*1
		while(num>0) {
			fact = fact*num;
			num--;
		}
		System.out.println("Factorial of given Number = "+fact);
		sc.close();
		
	}

}
