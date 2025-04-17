package com.basicPrograms;

public class MissingInArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,10};
		int sum1 = 0;
		for(int val:a) {
			sum1+=val;
		}
		System.out.println("Sum of elements in array = "+sum1);
		
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			sum2+=i;
		}
		System.out.println("Sum of range of elements = "+sum2);
		int missingElement = sum2-sum1;
		System.out.println("Missing element = "+missingElement);
	}

}
