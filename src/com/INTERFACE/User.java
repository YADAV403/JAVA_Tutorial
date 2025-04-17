package com.INTERFACE;

public class User {
	public static void main(String[] args) {
		
	Laptop dell = new Dell();
	dell.display();
	dell.battery();
	dell.keyboard();
	dell.audio();
	System.out.println();
	Laptop.memory();
	System.out.println();
	HP hp = new HP();
	hp.display();
	hp.battery();
	hp.keyboard();
	hp.camera();

}}
