package com.basicPrograms;

public class EvenOddArray {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
//		System.out.println("Even Numbers from Array:");
//		for(int i=0; i<a.length; i++) {
//			if(a[i]%2==0)
//				System.out.println(a[i]);
//		}
//		
//		System.out.println("Odd Numbers from Array:");
//		for(int i=0; i<a.length; i++) {
//			if(a[i]%2!=0)
//				System.out.println(a[i]);
//		}
		
		System.out.println("Even Numbers from Array:");
		for(int val:a) {
			if(val%2==0)
				System.out.println(val);
		}
		
		System.out.println("Odd Numbers from Array:");
		for(int val:a) {
			if(val%2!=0)
				System.out.println(val);
		}
	}

}
