package com.basicPrograms;

import java.util.Scanner;

public class ReversingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
//		Using "ALGORITHM"
		int temp,rev=0;
		while(num>0) {
			temp = num%10;
			rev = (rev*10)+temp;
			num = num/10;
		}
		System.out.println("Reverse of a Number=" + rev);
		
//		Using "STRINGBUFFER"
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
		
//		Using "STRINGBUILDER"
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(num);
//		System.out.println(sbl.reverse());
		sc.close();
	}

}
