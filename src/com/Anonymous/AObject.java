package com.Anonymous;

public class AObject {
	int i = 5;
	public void read() {
		System.out.println("i am reading");
	}
//	public void write() {
//		System.out.println("i am writing");
//	}
	public static void main(String[] args) {
//		AObject ao = new AObject();
//		ao.read();
//		ao.write();
		new AObject().read();
	}

}
