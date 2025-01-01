package com.threads;

public class ThreadDemo1 extends Thread{

	//thread  run method...
	
	
	public void run() {
	
		try {
			Thread.sleep(2000);
			//System.out.println("Thread is running....");
			for(int i=1;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+" Thread is running "+i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		
		ThreadDemo1 t1 = new ThreadDemo1(); //t1
		ThreadDemo1 t2 = new ThreadDemo1(); //t2
		ThreadDemo1 t3 = new ThreadDemo1(); //t2
		ThreadDemo1 t4 = new ThreadDemo1(); //t2
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		t4.setName("D");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t1.start();
		
		
	}
}
