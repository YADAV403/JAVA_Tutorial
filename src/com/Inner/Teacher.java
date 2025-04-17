package com.Inner;

public class Teacher {
	public static void main(String[] args) {
		
		Sir s= new Sir() {public void work() {
			 System.out.println("working");
		 }
		};
		s.speak();
		s.work();
	}

}

class Sir{
	
	 public void speak() {
		 System.out.println("speaking");
	 }
	 
	 public void work() {
		 System.out.println("walking");
	 }
}

//class Madam extends Sir{
//	 
//	 public void work() {
//		 System.out.println("working");
//	 }
//}