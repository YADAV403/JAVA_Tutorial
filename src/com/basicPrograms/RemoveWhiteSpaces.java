package com.basicPrograms;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s = "    prashanth   yadav   ";
		System.out.println(s.replaceAll("\\s", ""));
	}

}
