package com.propertyFile;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
	public static void main(String[] args) {
//		Iterating all classes
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		 Iterator<Integer> i = al.iterator();
		 
		 while(i.hasNext())
			 System.out.println(i.next());
		
	}

}
