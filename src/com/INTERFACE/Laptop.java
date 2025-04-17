package com.INTERFACE;

public interface Laptop {
	
	public void display();
	public void keyboard();
	public void battery();
	
	static void memory() {
		System.out.println("laptop's memory");
	}
	default void audio() {
		System.out.println("laptop's audio");
	}

}
