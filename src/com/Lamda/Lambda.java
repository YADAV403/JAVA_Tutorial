package com.Lamda;

public class Lambda {

	public static void main(String[] args) {
		Car c =  (speed,colour)->{
			System.out.println("tata speed=" +speed);
			System.out.println("tata colour=" +colour);
		};
		c.engine(50, "red");
	}
}


