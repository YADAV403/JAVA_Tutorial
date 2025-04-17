package com.propertyFile;

import java.util.*;

public class Enumerator {
	public static void main(String[] args) {
//		Iterating legacy classes-->v1.0
		
//		Vector<Integer> v = new Vector<>();
//		v.add(1);
//		v.add(2);
//		v.add(3);
		
		Hashtable<String,Integer> v = new Hashtable<>();
		v.put("sahithi",1);
		v.put("prashanth",2);
		v.put("vinay",3);
		
//		Properties p = new Properties();
//		p.setProperty("url","localhost");
//		p.setProperty("name", "YADAV002");
		
		Enumeration<Integer> e = v.elements();
//		Enumeration<Object> e = p.elements();
		
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}

}
