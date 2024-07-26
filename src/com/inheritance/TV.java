package com.inheritance;

class Sony{
	
	public void sony() {
		System.out.println("sony...");
	}
}

class Bravia extends Sony{
	
	public void bravia() {
		System.out.println("bravia...");
	}
}

public class TV extends Bravia {
	
	public void tv() {
		System.out.println("tv method called...");
	}
	
	public static void main(String[] args) {
	
		System.out.println("Tv...");
		TV t = new TV();
		t.bravia();
		t.sony();
		
		Bravia b = new Bravia();
		b.bravia();
		b.sony();
		//b.tv();
	}
	
}
