package com.collections;

import java.util.*;

public class Maap {
	public static void main(String[] args) {
//		creation of map
		Map<Integer,String> m = new Hashtable<>();
		System.out.println(m);
		
		System.out.println();
		
//		addition of elements
		m.put(1, "sahithi");
		m.put(2, "prashanth");
		m.put(3, "vinay");
		System.out.println(m);

		System.out.println();

//		retrieval of keys
		Set<Integer> keys = m.keySet();
		for(Integer Int:keys)
			System.out.println(Int);

		System.out.println();

//		retrieval of values
		Collection<String> val = m.values();
		for(String v:val)
			System.out.println(v);

		System.out.println();
		
//		deletion of elements
		System.out.println(m);
		m.remove(2);
		System.out.println(m);
		
		System.out.println();

//		verification of keys and values
		System.out.println(m.containsKey(3));
		System.out.println(m.containsKey(5));
		System.out.println(m.containsValue("sahithi"));
		System.out.println(m.containsValue("saiteja"));
		
		System.out.println();

//		updation of elements
		System.out.println(m);
		m.replace(1,"sahithya");
		System.out.println(m);




	}

}
