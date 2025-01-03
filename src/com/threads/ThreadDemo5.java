package com.threads;



class MyThread2 implements Runnable{
	
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is running... ");
		
	}
}



public class ThreadDemo5 {

	
	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		
		
		t1.run();
		t2.run();
		t3.run();
		
	}
}
