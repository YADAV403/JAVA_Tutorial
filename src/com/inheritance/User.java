package com.inheritance;

public class User {
	public static void main(String[] args) {

		Mother mother = new Mother();
		mother.cook();
		mother.wash();
		
		Father father = new Father();
		father.cook();
		father.wash();
		father.work();
		
		Child child = new Child();
		child.cook();
		child.wash();
		child.work();
		child.read();
	}
}
