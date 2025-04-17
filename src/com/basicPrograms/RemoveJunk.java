package com.basicPrograms;

public class RemoveJunk {
	public static void main(String[] args) {
		String s = "@#$%^&*!prashanthyadav";
		String S = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S);
	}

}
