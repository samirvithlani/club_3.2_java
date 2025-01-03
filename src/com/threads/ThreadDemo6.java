package com.threads;

class MyThread3 implements Runnable{
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is running...");
		
	};
}

public class ThreadDemo6 {

	
	public static void main(String[] args) {
		MyThread3 m = new MyThread3();
		
		
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
