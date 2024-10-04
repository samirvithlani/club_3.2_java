package com.exception;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
}


public class ExceptionDemo8 {
	
	
	public void checkAge() throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age..");
		int age = sc.nextInt();
		
		if(age<18) {
			
			throw new InvalidAgeException("age is not valid..");
		}
		else {
			System.out.println("age "+age);
		}
	}
	
	
	

	public static void main(String[] args) {
		
		
		ExceptionDemo8 e8 = new ExceptionDemo8();
		try {
		e8.checkAge();
		}catch (InvalidAgeException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
}
