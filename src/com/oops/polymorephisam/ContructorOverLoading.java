package com.oops.polymorephisam;

public class ContructorOverLoading {

	// const is special function which has same name as class name
	// const can have param

	public ContructorOverLoading() {

		System.out.println("default const...");
	}

	public ContructorOverLoading(int x) {
		System.out.println("param const int");
	}

	public ContructorOverLoading(int x, float y) {

		System.out.println("param const...");
	}

	public static void main(String[] args) {

	}
}
