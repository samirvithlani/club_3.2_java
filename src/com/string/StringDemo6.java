package com.string;

public class StringDemo6 {

	public static void main(String[] args) {
		
		
		String str = "royal technosoft pvt ltd";
		String str2="";
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			System.out.println(c);
			
			if(c!=' ') {
				str2 = str2 + c;
			}
			
			
		}
		
		System.out.println(str2);
		
		
	}
	
	
}
