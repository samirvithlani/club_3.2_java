package com.oops.abstraction;


abstract class Android{
	
	
		public abstract void os();
		public void calander() {
			System.out.println("os calander...");
		}
	
		public Android(){
			System.out.println("os const...");
		}
	
}

public class Samsungs23 extends Android {

	public static void main(String[] args) {
		
		
//		Samsungs23 s23= new Samsungs23();
//		s23.os();
//	
		
		Android a = new Samsungs23();
		a.os();
		//Android a = new Android();
		
	}

	public void os() {
		
		System.out.println("os of samsung...");
		
	}
}
