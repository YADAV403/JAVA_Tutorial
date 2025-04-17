package com.basicPrograms;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check Prime or Not:");
		int num = sc.nextInt();
		for(int i=2; i<num-1; i++) {
			if(num%i==0) {
				System.out.println("Not a Prime");
				System.exit(i);
			}	
		}
		System.out.println("Prime");
		sc.close();
	}

}
