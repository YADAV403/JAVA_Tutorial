package com.basicPrograms;

public class CopyArrayElements {
	public static void main(String[] args) {
		int[] arr1 = {10,34,57,88,19};
		int[] arr2 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println("Array1 Elements:");
		for(int ele:arr1) {
			System.out.print(ele+" ");
		}
		
		System.out.println("\nArray2 Elements:");
		for(int i=arr2.length-1; i>=0; i--) {
			System.out.print(arr2[i]+" ");
		}
	}

}
