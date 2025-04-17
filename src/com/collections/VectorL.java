package com.collections;

import java.util.Vector;

public class VectorL {
	public static void main(String[] args) {
//		creation of vector
		Vector<String> v1 = new Vector<>();
		System.out.println(v1);
		
		System.out.println();
		
//		addition of elements
		v1.add("tony");
		v1.add(0,"revi");
		System.out.println(v1);
		
		System.out.println();
		
//		retrieval of elements
		System.out.println(v1.get(0));
		
		System.out.println();
		
//		deletion of elements
		System.out.println(v1);
		System.out.println(v1.remove("tony"));
		System.out.println(v1);
		
		System.out.println();
		
//		updation of elements
		System.out.println(v1);
		System.out.println(v1.set(0,"ravi"));
		System.out.println(v1);
		
		System.out.println();
		
//		verification of elements
		System.out.println(v1.contains("ravi"));
		System.out.println(v1.contains("sahithi"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
