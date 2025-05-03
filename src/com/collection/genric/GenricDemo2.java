package com.collection.genric;

public class GenricDemo2<T extends Number> {
	
	public void calulate(T a,T b) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.intValue()*b.intValue());
	}

	public static void main(String[] args) {

	
		GenricDemo2<Integer> g1 = new GenricDemo2<Integer>();
		g1.calulate(100, 200);
//		GenricDemo2<String> g2 = new GenricDemo2<String>();
//		g2.calulate("ram","shyam");
	}
}
