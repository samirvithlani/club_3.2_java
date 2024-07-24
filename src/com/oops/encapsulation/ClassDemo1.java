package com.oops.encapsulation;
class Demo{
	
	public void demo() {
		System.out.println("demo....");
	}
}

public class ClassDemo1 {

	
	public static void main(String[] args) {
		
		
		//Demo d ;//heap memory :--
		//Demo d = new Demo();
		Demo d; //ref
		d = new Demo(); //object
		d.demo();
	}
	
	
	
	
}
