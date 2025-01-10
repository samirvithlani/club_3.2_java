package com.threads;

public class ThreadDemo9 extends Thread {

	public static int amount =1500;
	public int withdrawAMount=0;
	
	public ThreadDemo9(int wamount) {
		this.withdrawAMount =wamount; 
	}
	
	public  void withDraw(int withdrawamount) {
		
		System.out.println("checking balnce...." + Thread.currentThread().getName());
		
		
			
		
			System.out.println(Thread.currentThread().getName() + " is trying to wihdraw "+amount);
			this.amount = this.amount-withdrawamount;
			System.out.println("after withdraw ramining balance. "+this.amount);
			
		
		
		
	}
	
	@Override
	public void run() {
		
		withDraw(withdrawAMount);
	}
	
	 public static void main(String[] args) {
		
		 ThreadDemo9 t1 = new ThreadDemo9(1000);
		 ThreadDemo9 t2 = new ThreadDemo9(1000);
		 ThreadDemo9 t3 = new ThreadDemo9(1000);
		 
		 t1.setName("papa");
		 t2.setName("mummy");
		 t3.setName("child");
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 
		 
	}
}
