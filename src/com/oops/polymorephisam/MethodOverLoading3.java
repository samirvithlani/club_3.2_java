package com.oops.polymorephisam;


class Bank{
	
	
	public void balance(int a,int b) {
		
		System.out.println("int a,int b");
	}
	
	
	
}

public class MethodOverLoading3 extends Bank {

	

	
	public void balance(int x) {
		
		System.out.println("int balance..");
	}
	
	public void balance(float y) {
		
		System.out.println("float balancve...");
	}
	
	
	public static void main(String[] args) {
		
		MethodOverLoading3 m3  = new MethodOverLoading3();
		m3.balance(12, 22);
		
		
	}
}
