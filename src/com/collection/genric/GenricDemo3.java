package com.collection.genric;

import java.util.ArrayList;
import java.util.List;

public class GenricDemo3<T> {
	
	public static void display(List<?> data) {
		for(Object o:data) {
			System.out.println(o);
		}
	}
	
	

	public static void main(String[] args) {
	
		
		List<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("sumit");
		list.add("raj");
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		display(list1);
		display(list);
		
		
		
	}
}
