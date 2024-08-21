package com.oops.abstraction;

//class
//interface is fully abstract class
interface Mutable{
	
	//by default abstract..
	//public abstract void mutation();
	//instance variable....
	//public static final int x = 100'
	int x=100;
	public void mutation();
	
}
interface Reaction{
	
	public abstract void react();
}

public class Mutate implements Mutable,Reaction {

	
	public void mutation() {
		
		System.out.println("mutation method called.."+Mutable.x);
		
	}
	
	public static void main(String[] args) {
		
		
		//Mutable m = new Mutable();
		Mutable m = new Mutate();
		m.mutation();
		Reaction r = new Mutate();
		r.react();
	}

	public void react() {
		
		System.out.println("react method called...");
		
	}

	
	
}
