package com.Polymorphism;

public class Overidding extends Overriding {
	public void add() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		Overriding or = new Overriding();
		or.add();
		
	}

}
