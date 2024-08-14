package com.oops.polymorephisam.overriding;

class Country {

	public void population() {

		System.out.println("country population....");
	}
}

public class India extends Country {

	public void population() {

		System.out.println("india population....");
	}

	public static void main(String[] args) {
		
		
		//polyorephic object // runtime polymorephisam...
		//India i referance
		//new India(); object..
		//polymorephic object is that , when we create referance of parent class and object of child calass
		//it is called polymorephic object...
		//India i = new India();
		//i.population();
		Country c = new India();
		c.population();

	}
}
