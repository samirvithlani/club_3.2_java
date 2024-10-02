package com.exception;

import java.util.Scanner;

public class ExceptionDemo5 {

	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			
			int no = sc.nextInt();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
		
		//System.out.println(sc);
		
		
		
	}
}
