package com.inheritance;

//use parent| base  class prop in child | derived class this process called inheritance
//in java we can use extend keyword or implements keyword
//type of inheritace
//single
//multilevel
//hyr
//hybride


class India{
	
	int year = 1947;
	public void demo() {
		System.out.println("demo method called....");
	}
	
	public static void testing() {
		System.out.println("testing...");
	}
	
}

public class InheritanceDemo1 extends India {
	
	public void test() {
		System.out.println(year);
		demo();
		testing();
		
	}

	public static void main(String[] args) {
		
		//System.out.println("year  = "+year);
		
	}
}
