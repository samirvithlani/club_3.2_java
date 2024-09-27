package com.exception;

import java.util.Scanner;

public class ExceptionDemo2 {

	static Scanner sc;
	public static void main(String[] args) {
		
		try {
		System.out.println("enter no 1");
		int no1 = sc.nextInt();
		System.out.println(no1);
		}catch (NullPointerException e) {
			
			System.out.println("null object..");
		}
		
		
		
		
		
	}
}
