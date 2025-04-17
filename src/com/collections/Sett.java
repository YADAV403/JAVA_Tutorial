package com.collections;

import java.util.*;

public class Sett {
	public static void main(String[] args) {
//		creation of hashset
		Set<Integer> hs = new HashSet<Integer>();
		System.out.println(hs);
		
		System.out.println();
		
//		addition of elements
		hs.add(1);
		hs.add(4);
		hs.add(3);
		hs.add(null);
		hs.add(1);
		System.out.println(hs);
		
		System.out.println();
		
//		retrieval of elements
		for(Integer val:hs)
			System.out.println(val);
		
		System.out.println();
		
//		deletion of elements
		System.out.println(hs);
		System.out.println(hs.remove(1));
		System.out.println(hs);
		
		System.out.println();
		
//		verification of elements
		System.out.println(hs.contains(4));
		System.out.println(hs.contains(1));
		
		System.out.println();
		
//		creation of linkedhashset
		Set<Integer> lhs = new LinkedHashSet<>();
		System.out.println(lhs);
		
		System.out.println();
		
//		addition of elements
		lhs.add(1);
		lhs.add(4);
		lhs.add(3);
		lhs.add(1);
		lhs.add(null);
		System.out.println(lhs);
		
		System.out.println();
		
//		retrieval of elements
		for(Integer vall:lhs)
			System.out.println(vall);
		
		System.out.println();
		
//		deletion of elements
		System.out.println(lhs);
		System.out.println(lhs.remove(null));
		System.out.println(lhs);
		
		System.out.println();
		
//		verification of elements
		System.out.println(lhs.contains(1));
		System.out.println(lhs.contains(null));
		
		System.out.println();
		
//		creation of treeset
		Set<Integer> ts = new TreeSet<>();
		System.out.println(ts);
		
		System.out.println();
		
//		addition of elements
		ts.add(5);
		ts.add(4);
		ts.add(3);
		ts.add(5);
		ts.add(2);
		ts.add(1);
		System.out.println(ts);
		
		System.out.println();
		
//		retrieval of elements
		for(Integer ele:ts)
			System.out.println(ele);
		
		System.out.println();
		
//		deletion of elements
		System.out.println(ts);
		System.out.println(ts.remove(5));
		System.out.println(ts);
		
		System.out.println();
		
//		verification of elements
		System.out.println(ts.contains(1));
		System.out.println(ts.contains(5));
		
		
		
		
		
	}
	
	

}
