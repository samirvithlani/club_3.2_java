package com.wrapper;

public class WrapperDemo3 {

	
	public static void main(String[] args) {
		
		
		//
		Integer i = new Integer(100);
		System.out.println(i);
		Integer i1 = new Integer("100");
		System.out.println(i1);
		
		System.out.println(Integer.compare(200, 200));
		int x = Integer.parseInt("100");
		//int x = Integer.parseInt("100", '\0');
		System.out.println(x);
		Integer x1 = Integer.valueOf(100);
		System.out.println(Integer.min(100, 20));
		System.out.println(Integer.hashCode(785200));
		//- 0 1
		//36568  0 32667
		//System.out.println(Integer.reverse(1));
		
		
	}
}

