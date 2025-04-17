package com.Polymorphism;

public class Overloading {

	public void add(int a, int b) {
		System.out.println((a+b));	
	}

	public void add(int a,int b, int c) {
		System.out.println((a+b+c));	
	}
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.add(5,100);
		ol.add(4, 7, 3);

	}}
