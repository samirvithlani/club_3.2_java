package com.oops.polymorephisam;

public class MethodOverLoading {
	
	
	public void shape() {
		System.out.println("shape method called...");
	}
	public void shape(float r) {
		System.out.println("circle shaape..");
	}
	public void shape (int h) {
		System.out.println("int square shape");
	}
	public void shape(long l) {
		System.out.println("long square...");
	}
	public void shape (double h) {
		System.out.println("square doublr... shape");
	}
	//you can change access modifiers in overloadin
//	private void shape(int x) {
//		System.out.println("");
//	}
	
	public void shape(int x,int y) {
		System.out.println("x");
	}
	
	//return type will no consider as sperate method while overloading...
	public int shape(int x,String y) {
		
		System.out.println("x");
		return 100;
	}
	
	public static void main(String[] args) {
		
	
		MethodOverLoading m1 = new MethodOverLoading();
		//m1.shape();
		m1.shape(98765321234567799l);
		//m1.shape(12.12);
		
		
	}
}
