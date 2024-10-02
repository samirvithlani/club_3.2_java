package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("enter no 1");
			int no1 = sc.nextInt();
			System.out.println("enter no 1");
			int no2 = sc.nextInt();
			int ans = no1 / no2;
			System.out.println(ans);
		}
		catch (ArithmeticException  | InputMismatchException  e) {
		
			System.out.println("enter only digits and no2 should not be zero !");
		}
		
		
	}
}
