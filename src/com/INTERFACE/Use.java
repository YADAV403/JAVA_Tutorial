package com.INTERFACE;

public class Use {
	
	public static void main(String[] args) {
		
		Functional f = new Functional() {
			public void take() {
				System.out.println("i am taking");
			}
		};
		f.take();
	}

}
