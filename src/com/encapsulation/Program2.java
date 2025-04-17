package com.encapsulation;

public class Program2 {
	public static void main(String[] args) {
		
		Program1 program = new Program1();
		program.setId(7);
		program.setName("messi");
		System.out.println(program.getId());
		System.out.println(program.getName());
		program.test();	
	}
	

}
