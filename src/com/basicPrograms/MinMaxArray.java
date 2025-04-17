package com.basicPrograms;

public class MinMaxArray {
	public static void main(String[] args) {
		int a[] = {1,2,379,4,5,100};
		int max = a[0];
		for(int val:a) {
			if(max<val)
				max = val;
		}
		System.out.println("Maximum value from Array = "+max);
		
		int min = a[0];
		for(int val:a) {
			if(min>val)
				min = val;
		}
		System.out.println("Minimum value from Array = "+min);
	}

}
