package com.oops.polymorephisam.overriding;

class Demo {

	 public void myMethod(int x) {

		System.out.println("parent class mymehtod called!!!");
	}

}

public class Data extends Demo {

	//return type must be same....
	//if you change param it will be overloading...
	//if parent public --> child public
	//if parent private --> no overiding..
	//if parent deafault --> default,public,protected
	//if parent protected --> protected, public
	 public void myMethod(int x) {

		System.out.println("child.. class mymehtod called!!!");
	}

	public static void main(String[] args) {

		Data d = new Data();
		d.myMethod(100);
	}

}
