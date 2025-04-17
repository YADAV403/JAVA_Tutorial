package com.collections;

import java.util.LinkedList;

public class LinkedL {
	public static void main(String[] args) {
//		creation of llinkedlist
		LinkedList<String> l = new LinkedList<>();
		System.out.println(l);
		
		System.out.println();
		
//		addition of elements
		l.add("Y1");
		l.add(0,"Y2");
		l.add("Y3");
		System.out.println(l);
		
		System.out.println();
		
//		retrieval of elements
		System.out.println(l.get(2));
		
		System.out.println();
		
//		verification of element
		System.out.println(l.contains("Y2"));
		System.out.println(l.contains("Y0"));
		
		System.out.println();
		
//		deletion of elements
		System.out.println(l.remove(1));
		
		System.out.println();
		
//		updation of elements
		System.out.println(l.set(0,"Y22"));
		System.out.println(l);
		
		
	}

}
