package com.asseccmodifiers;

public class AccessModi1 {

	private int x;
	int d=10; //default
	protected int p =20;
	private void demo() {
		
		System.out.println(x);
		System.out.println(d);
		System.out.println(p);
	}
	void demo1() {
		System.out.println("defalt method..");
	}
	
	public static void main(String[] args) {
		
		AccessModi1 a1 = new AccessModi1();
		a1.demo();
		a1.demo1();
		
	}
}
