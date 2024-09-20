package com.string;

public class StringDemo9 {

	
	public static void main(String[] args) {
		
		
		String demo = "royal technosoft pvt ltd";
		System.out.println(demo.isEmpty());
		
		String x[] = demo.split(" ");
		for(String s:x) {
			System.out.println(s);
		}
		
		
		
	}
}
