package com.oops;


class Person{
	int id;
	String name;
	//param const...
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	//shallow copy :
	//deep copy

	//deep copy
	public Person(Person copyPerson) {
		
		this.id = copyPerson.id;
		this.name = copyPerson.name;
	}
	
	
	
}



public class CopyDemo {

	
	public static void main(String[] args) {
		
		
		Person og = new Person(101,"raj");
		Person copy = new Person(og);
		
		
		System.out.println("id = "+copy.id);
		System.out.println("name = "+copy.name);
		
		copy.id = 1000;
		copy.name = "RAM";
		
		System.out.println("id = "+og.id);
		System.out.println("name = "+og.name);
		
		
		
		
		
	}
}
