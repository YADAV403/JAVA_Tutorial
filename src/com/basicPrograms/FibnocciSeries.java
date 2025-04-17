package com.basicPrograms;

import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Value:");
		int n1 = sc.nextInt();
		
		System.out.println("Enter 2nd Value:");
		int n2 = sc.nextInt();
		int sum = 0;
		
		for(int i=2; i<10; i++) {
			sum = n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}
		sc.close();
	}

}
