package com.threads;

public class ThreadDemo2 extends Thread{

	
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+ " is runnung.. " +i);
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Executaion started...");
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		ThreadDemo2 t3 = new ThreadDemo2();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		System.out.println("t1 starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		System.out.println("t2 starts");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		System.out.println("t3 starts");
		
		
		
		
	}
}
