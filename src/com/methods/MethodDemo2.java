package com.methods;

public class MethodDemo2 {
	//methods | functions*:
	//type of method : pre define method | user define method...
	//method signature:access modifiers non access modifiers return type name params
	//non static method | static method
	
	public void test() {
		
		System.out.println("non static wo return type without args");
		//if non static method call from non static within same class no object is required..
		sum(100,20,20);
	}
	
	public int sum(int a,int b,int c) {
		
		return a + b + c;
	}
	

	public static void main(String[] args) {
		
		//all non static method can call from sattic method using objecct only....
		MethodDemo2 m1 = new MethodDemo2();
		//m1 -> object
		m1.test();
		int ans = m1.sum(1, 2, 3);
		System.out.println("ans = "+ans);
	
	}
}
