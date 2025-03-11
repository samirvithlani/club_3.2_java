package com.collection;

import java.util.ArrayList;
import java.util.List;

class Book {

	int id;
	String name;
	float price;

	public Book(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		
		//return super.toString();
		//return "ok";
		return "id = "+id + "Name = "+name+" Price = "+price;
	}

}

public class ListDemo2 {

	public static void main(String[] args) {

//		List<String> n = new ArrayList<String>;
		List<Book> books = new ArrayList<Book>();

		Book b1 = new Book(101, "java", 500.00f);
		Book b2 = new Book(102, "python", 350.00f);
		Book b3 = new Book(103, "js", 400.00f);

		books.add(b1);
		books.add(b2);
		books.add(b3);

		books.add(new Book(104, "cpp", 200f));
		
		
		for(Book b:books) {
			//System.out.println(b.id  + " " + b.name + " "+b.price);
			System.out.println(b);
		}
		
		
		
		
		
		
		

	}
}
