package com.basicPrograms;

import java.util.Scanner;

public class CountEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		//		1234
		while(num>0) {
			int rem = num%10;
			if(rem%2==0)
				evenCount++;
			else
				oddCount++;
			num=num/10;
		}
		System.out.println("evenCount=" +evenCount);
		System.out.println("oddCount=" +oddCount);
		sc.close();
	}

}
