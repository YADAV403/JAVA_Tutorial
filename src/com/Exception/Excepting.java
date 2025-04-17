package com.Exception;

import java.lang.Exception;

public class Excepting {
	public static void main(String[] args) throws Exception{
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ae) {
			throw new Tony("tony is in canada");

		}
	}

}
