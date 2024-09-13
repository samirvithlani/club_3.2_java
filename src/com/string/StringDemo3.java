package com.string;

public class StringDemo3 {


	
	public static void main(String[] args) {
		
		String str = "amit";
		String str1 ="";
		
		for(int i=0;i<str.length();i++) {
			
			str1 = str1 + str.charAt(i);
			
		}
		
		System.out.println(str1);
		
		
	}
}
