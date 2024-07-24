package com.methods;

public class MethodDemo1 {

	//variables:
	//data type:
	//local variable | instance variable
	//static variable | non static variable
	
	//instance variable.. not need to initilize compulsary
	//non static
	//0
	int p;
	static int y=20; //static instance
	
	public void test() {
		int x;//local
		//all instance static |non static variable can use inside non static method...
		System.out.println(p);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		
		int a =100; //local variable...
		int x=20;
		System.out.println(a);
		System.out.println("value of a  = "+(a+100));
		System.out.println(x);
		
		System.out.println(y);
		//System.out.println(p);
		//non static instance variable can not use direclty inside static method
		
	}
}
