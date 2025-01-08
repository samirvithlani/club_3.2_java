package com.threads;

/*
 * syncronization:
 * 
 * syncronized method 
 * syncronized block ...
 * 
 * 
 * */

class BookTicket extends Thread{
	
	
	public static int ticketCount =5;
	
	public void run() {
		String userName = Thread.currentThread().getName();
		bookTicket(userName);
		
	}
	
	
	public synchronized  void bookTicket(String userName) {
		
		System.out.println("ticket count"+ticketCount);
		if(ticketCount>0) {
			System.out.println(userName + " your ticket has been booked..");
			//System.out.println(ticketCount);
			ticketCount--;
		}
		else {
			System.err.println(userName + " your ticket has not been booked..");
		}
		
		
	}
	
}



public class ThreadDemo7 {

	public static void main(String[] args) {
		
		BookTicket bookTicket = new BookTicket();
		Thread t1 = new Thread(bookTicket,"Jay");
		Thread t2 = new Thread(bookTicket,"Parth");
		Thread t3 = new Thread(bookTicket,"Jeet");
		Thread t4 = new Thread(bookTicket,"Samir");
		Thread t5 = new Thread(bookTicket,"Tejas");
		Thread t6 = new Thread(bookTicket,"Akshit");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		
		
		
		
	}
}
