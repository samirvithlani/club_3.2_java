package com.methods;

public class MethodDemo3 {
	
	
	public static void demo() {
		
		System.out.println("wo args wo return static");
	}
	
	public void test() {
		
		MethodDemo3.demo();
	}
	
	public static float findAvg(float a,float b) {
		
		return a + b / 2;
	}
	

	public static void main(String[] args) {
		
		
		//no object is required to call static methods..
		MethodDemo3.demo();
		
		
//		MethodDemo3 m3 = new MethodDemo3();
//		m3.demo(); warning...
		
		
		
		System.out.println("avg   "+MethodDemo3.findAvg(100, 20));
		
		
	}
}
