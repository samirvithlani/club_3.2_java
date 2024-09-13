package com.string;

public class StringDemo1 {

	//java String class java.lang
	//mutable:
	//immutable:yes..
	//String :stores data in dynami aarray
	
	
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = new String("java");
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = str1.concat("python");
		System.out.println(str1);
		
		int len = str1.length();
		System.out.println("len of string = "+len);
		//System.out.println(str1[0]);
		System.out.println(str1.charAt(0));
		
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		
		
		
		
	}
}
