package com.methods;

class Apple{
	
	int price;
	int qty;
	//50...
	
	
}

public class MethodObject {
	
	
	
	public void getApple(Apple a1) {
		
		System.out.println(a1);
		System.out.println(a1.price);
		System.out.println(a1.qty);
		
	}

	public static void main(String[] args) {
		
		Apple a = new Apple();
		System.out.println(a);
		a.price =100;
		a.qty=10;
		
		MethodObject obj = new MethodObject();
		obj.getApple(a);
		
		
	}
}
