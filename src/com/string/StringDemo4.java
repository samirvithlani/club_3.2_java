package com.string;

public class StringDemo4 {

	public static void main(String[] args) {
		
		
		//remove space from between..
		String email = "  amit@gmail.com  ";
		System.out.println("before trim..."+email.length());
		
		email = email.trim();
		System.out.println("after trim..."+email.length());
		System.out.println("email = "+email);
		
		
		//boolean...
		String name = "royala";
		System.out.println("starts with..."+name.startsWith("r"));
		System.out.println("ends with "+name.endsWith("ya"));
		
		System.out.println("contains.."+name.contains("a")); //case senctivity...
		
		System.out.println("equals"+name.equals("royal"));
		System.out.println((name == "royal"));
		
		
		String s1 = "amit";
		String s2 = "amit";
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("amiT");
		
		System.out.println("s1 == s3"+s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		int index = name.indexOf('y');
		System.out.println("index = "+index);
		index = name.lastIndexOf('a');
		System.out.println("index = "+index);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
