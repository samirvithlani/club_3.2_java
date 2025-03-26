package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	//hashSet
	//treeset
	public static void main(String[] args) {
		
		
		Set<String> set = new TreeSet<String>(); 
		
		set.add("kunal");
		set.add("amit");
		set.add("parth");
		set.add("ajit");
		set.add("mansukh");
		set.add("mansukh");
		
		System.out.println(set.remove("parth"));
		
		System.out.println("is empty"+set.isEmpty());
		
		System.out.println(set.contains("kunal"));
		
		
		
		for(String s:set) {
			
			System.out.println(s);
		}
		
		
	}
}
