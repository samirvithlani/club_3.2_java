package com.inheritance;

class RBI{
	
	public RBI() {

		System.out.println("Rbi class Cost....");
	}
	
	
}
public class Bank extends RBI {

	
	
	public Bank() {

		System.out.println("Bank class const...");
	}
	
	
	public static void main(String[] args) {
		
		
		Bank b = new Bank();
	}
}
