package com.collections;

import java.util.ArrayList;

public class ArrayL {
	public static void main(String[] args) {
//		creation of arraylist
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al);
		
		System.out.println();
		
//		addition of elements
		al.add("prashanth");
		al.add(0,"tony");
		System.out.println(al);
		
		System.out.println();

//		retrieval of elements
		System.out.println(al.get(1));
		
		System.out.println();
		
//		deletion of elements
		System.out.println(al);
		System.out.println(al.remove(0));
		System.out.println(al);
		
		System.out.println();
		
//		verification of elements
		System.out.println(al.contains("tony"));
		System.out.println(al.contains("prashanth"));
		
		System.out.println();
		
//		updation of elements
		System.out.println(al.set(0, "sahithi"));
		System.out.println(al);
		
//		ArrayList<String> al2 = new ArrayList<>();
//		al2.add("prashanth");
//		al2.add("tony");
//		
//		System.out.println(al.contains(al2));
//		
//		
//		System.out.println(al);
//		System.out.println(al2);
	}

}
