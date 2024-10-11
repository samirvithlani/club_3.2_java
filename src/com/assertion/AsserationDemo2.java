package com.assertion;

public class AsserationDemo2 {

	public static void main(String[] args) {
		
		//100 ---> change -->rule...
		
		System.out.println("enter name");
		String name = "rama";
		assert name.length()<3:"name length must greater tnhn 3";
		System.out.println("name = "+name);
		
		
	}
}
