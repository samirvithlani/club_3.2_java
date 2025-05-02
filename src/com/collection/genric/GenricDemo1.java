package com.collection.genric;

//templates...

class Demo<T>{
	
	
	public void add(T a) {
		System.out.println(a);
	}
	
}
public class GenricDemo1 {

	
	public static void main(String[] args) {
	
		Demo<Integer> d = new Demo();
		d.add(100);
		Demo<String> d1 = new Demo();
		d1.add("ram");
		
	}
	
	
}
