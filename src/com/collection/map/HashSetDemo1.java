package com.collection.map;

import java.util.HashMap;
import java.util.Map.Entry;

class Books{
	
	String bookName;
	int bookPrice;
	public Books(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
}

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashMap<String, Books> books =new HashMap<String, Books>();
		books.put("amit", new Books("java", 1200));
		books.put("raj", new Books("python", 1000));
		books.put("jeet", new Books("cpp", 800));
		
			
		for(Entry e:books.entrySet()) {
			
			System.out.print(e.getKey());
			Books b = (Books) e.getValue();
			System.out.print(" "+b.bookName + " "+b.bookPrice);
			System.out.println();
		}
			
	}
}
