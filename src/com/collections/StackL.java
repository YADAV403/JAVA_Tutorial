package com.collections;

import java.util.Stack;

public class StackL {
	public static void main(String[] args) {
//		creation of stack
		Stack<String> s = new Stack<>();
		System.out.println(s);
		
		System.out.println();
		
//		addition of elements
		s.push("prashanth");
		s.push("tony");
		s.push("revi");
		System.out.println(s);
		
		System.out.println();
		
//		retrieval of elements
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println();
		
//		deletion of elements
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println();
		
//		verification of elements
		System.out.println(s.search("prashanth"));
				
	}
//	    push peek pop search


}
