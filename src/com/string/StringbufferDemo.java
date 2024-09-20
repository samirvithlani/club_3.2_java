package com.string;

public class StringbufferDemo {

	
	//StringBuffer : Thread Safe
	//StringBuilder : Thread unSafe
	
	public static void main(String[] args) {
		
		
		
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb);
		sb.append(" technosoft");
		System.out.println(sb);
		
		//System.out.println(sb.chars());
		//System.out.println(sb.reverse());
		System.out.println(sb.codePointBefore(3));
		System.out.println(sb.codePointCount(0, 10));
		//System.out.println(sb.substring(2,5));//234
		//System.out.println(sb.substring(2));//234
		sb.insert(1, "#97868767");
		System.out.println(sb);
		
		
	}
}
