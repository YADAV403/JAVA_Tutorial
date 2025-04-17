package com.basicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class BuiltInSort {
	public static void main(String[] args) {
		Integer a[] = {1,2,3,4,5};
		
//		System.out.println("Array before sorting:"+Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Array after sorting:"+Arrays.toString(a));
		
//		System.out.println("Array before sorting:"+Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Array after sorting:"+Arrays.toString(a));
		
		System.out.println("Array before sorting:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting:"+Arrays.toString(a));	
	}

}
