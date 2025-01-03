package com.threads;

class MyThread1 extends Thread{
	
	
	
	public void run() {
	
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + " is running... " + i);
		}
			
	}
	
	
	
}

public class ThreadDemo4 {

	
	public static void main(String[] args) {
		
		
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
		
	}
}
