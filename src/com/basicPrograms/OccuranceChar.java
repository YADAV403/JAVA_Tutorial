package com.basicPrograms;

public class OccuranceChar {
	public static void main(String[] args) {
		String s = "prashanth";
		int len1 = s.length();
		String S = s.replaceAll("a","");
		int len2 = S.length();
		int len3 = len1-len2;
		System.out.println("Occurance of a = "+len3);
		
		
	}

}
