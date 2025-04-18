package com.collection;

import java.util.function.Predicate;

public class PredicateDemo {

	// list//set/array --> ["amit","ajay","ram","shyam"]
	// [true,true,false,false]
	// ["amit","ajay"]
	// a>10
	// ram==ram
	// a=20 -->no
	// b.startsWith("z")
	// b.equals(a)
	// predicate interface
	// test :--> Boolean
	public static void main(String[] args) {

		Predicate<String> p = (String s) -> {

			// test
			return s.startsWith("a");
		};

		System.out.println(p.test("amit"));
		
		//Predicate<Integer> p1 = (x)-> {return x>=100;};
		Predicate<Integer> p1 = (x)->  x>=100;
		System.out.println("p1--->"+p1.test(20));
	}
	
	
	
	

}
