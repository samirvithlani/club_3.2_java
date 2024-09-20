package com.string;

public class StringDemo10 {

	public static void main(String[] args) {
		
		
		String name = "abc";
		StringBuffer sb = new StringBuffer(name);
		name = sb.reverse().toString();
		//sb.reverse();
		//System.out.println(sb);
		//System.out.println(name);
		
		
	}
}
