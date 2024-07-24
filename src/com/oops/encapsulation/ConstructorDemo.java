package com.oops.encapsulation;

public class ConstructorDemo {

	//constructor is special method which has same name as class name
	//const does not have return type
	//const can have params
	//const can have access modifiers but not non access mopdifiers
	//use of constructor in java:
		//to initialize instance variable of class
		//to load class in memory
	
	
	//type of constructor
	//default cons
	//param
	//copy*: not with pointer
	//it will call auto when class object is getting create....
	
	
	public ConstructorDemo() {
		
		System.out.println("default constructor...");
	}
	
	
	
	public static void main(String[] args) {
		
		
		ConstructorDemo c1 = new ConstructorDemo();
		
	}
}
