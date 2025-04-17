package com.Abstract;

import com.INTERFACE.Laptop;

public abstract class Sample implements Laptop {
	
	public void display() {
		System.out.println("demo display");
	}
	public void keyboard() {
		System.out.println("demo keyboard");
	}
}
