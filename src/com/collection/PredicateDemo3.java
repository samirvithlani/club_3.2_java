package com.collection;

import java.util.function.Predicate;

public class PredicateDemo3 {

	public static void main(String[] args) {
		
		
		Predicate<String> starts = (s)->s.startsWith("f");
		Predicate<String> len  = (s)->s.length()>3;
		//amit.startsWith and "amit">leh
		System.out.println("..."+starts.and(len).test("amit"));
		System.out.println("..."+starts.or(len).test("amit"));
		
		
		
	}
}
