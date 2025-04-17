package com.Exception;

public class Except {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		try { 
			c = a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println("can't divide by zero");
			throw ae;
		}
		finally {
			System.out.println(c);
		}
	}

}
