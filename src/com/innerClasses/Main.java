package com.innerClasses;

public class Main {
	private int id = 101;
	public static void main(String[] args) {
		System.out.println("main class executed");
		Inner1 in = new Main().new Inner1();
		in.both();
	}

	public class Inner1 extends Inner2{
		
		public void both() {
			read();
			write();
		}
			
	}
	
	public class Inner2{
		
		public void read() {
			System.out.println("i will read");
		}
		
		public void write() {
			System.out.println("i will write");
		}
		
	}


}

