package com.threads;

public class ThreadDemo3 extends Thread{

	
	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equals("A")) {
			
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep...");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+ " is runnung.. " +i);
		}
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Executaion started...");
		ThreadDemo3 t1 = new ThreadDemo3();
		ThreadDemo3 t2 = new ThreadDemo3();
		ThreadDemo3 t3 = new ThreadDemo3();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}
}
