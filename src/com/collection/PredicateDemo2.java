package com.collection;

import java.util.function.Predicate;

public class PredicateDemo2 {
	
	//sttaic....
	
	public static boolean evalute(Predicate p,int value) {
		
		//(x)-> 20 <=100 //20
		return p.test(value);
	}
	
	

	public static void main(String[] args) {
		
		Predicate<Integer> lessThen = (x)-> x <=100;
		System.out.println(evalute(lessThen, 20));
		
		
		
		
	}
	
}
