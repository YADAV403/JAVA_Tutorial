package com.basicPrograms;

public class SumOfArray {

	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,10};
		int sum = 0;
//		for(int i=0; i<=a.length-1; i++) {
//			sum+=a[i];
//		}
		
		for(int val:a) {
			sum+=val;
		}
		System.out.println("Sum of Array= "+sum);
	}

}
