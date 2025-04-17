package com.propertyFile;

import java.util.ListIterator;
import java.util.Vector;

public class LIterators {
	public static void main(String[] args) {
//		Iterating only list type of classes
		
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		ListIterator<Integer> li = v.listIterator();
		
		while(li.hasNext())
			System.out.println(li.next());
	}

}
