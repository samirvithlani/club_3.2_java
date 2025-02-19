package com.wrapper;

public class Wrapperwoverloding {

	
	public void demo(int x,int y) {
		
		System.out.println("prem...");
		System.out.println(x);
		System.out.println(y);
	}
	
//	public void demo(Integer x,Integer y) {
//		
//		System.out.println("non pre");
//		System.out.println(x);
//		System.out.println(y);
//	}
	
	
	public static void main(String[] args) {
		
		
		
		Wrapperwoverloding wo = new Wrapperwoverloding();
		//wo.demo(100, 200);
		wo.demo(new Integer(100), new Integer(200));
		
		
		
	}
}
