package com.MultiThreading;

public class Threading {
	public static void main(String[] args) throws InterruptedException{
		Runnable r1 = ()-> {
//			System.out.println("hi pitender"+"-->"+ Thread.currentThread().getName()+"-->"+Thread.currentThread().getId());
		};

		Thread t1 = new Thread(r1,"T1");
		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());
		t1.sleep(1000);

		System.out.println(t1.getState());
	}


}

