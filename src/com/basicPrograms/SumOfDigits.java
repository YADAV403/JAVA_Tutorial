package com.basicPrograms;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Find Sum of its Digits:");
		int num = sc.nextInt();
		//		123
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println("Sum of Digits=" +sum);
		sc.close();

	}

}
