package com.Inner;

public class Main {
	private int i = 10;
	public static void main(String[] args) {
		Main m = new Main();
		Inner1 in = m.new Inner1();
		in.add();
		
		
		
	}
	public class Inner1{
		private int i =11;
		public void add() {
			int i = 12;
			System.out.println(i);
			
			System.out.println(this.i);
			
			System.out.println(Main.this.i);
		}
		
		
			
		
			
	}
	}


