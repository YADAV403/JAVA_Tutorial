package com.basicPrograms;

public class ReverseWord {
	public static void main(String[] args) {
		String sentence = "My name is Prashanth yadav";
		System.out.println(sentence);
		String[] words = sentence.split(" ");
//		System.out.println(Arrays.toString(w));
		String reverse = "";
		for(String word:words) {
			String rever = "";
			for(int i=word.length()-1; i>=0; i--) {
				rever=rever+word.charAt(i);
			}
			reverse+=rever+" ";
		}
		System.out.println(reverse);	
	}
}
