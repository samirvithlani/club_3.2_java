package com.inheritance;

class Jio {

	public Jio(int charge) {

		System.out.println("jio class param const " + charge);
	}
//public Jio() {
//	// TODO Auto-generated constructor stub
//}
//	

}

public class Tel extends Jio {

	public Tel() {
		// explicit..
		// System.out.println(); error...
		super(666);
		System.out.println("tel class default...");
	}

	public static void main(String[] args) {

		Tel t = new Tel();

	}
}
