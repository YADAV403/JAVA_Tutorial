package com.Lamda;

public class Anonymous {

	public static void main(String[] args) {
		Car c = new Car() {
			public void engine(int speed, String colour) {
				System.out.println("bmw speed=" +speed);
				System.out.println("bmw colour=" +colour);
			}
		};
		c.engine(100,"orange");

	}

}
