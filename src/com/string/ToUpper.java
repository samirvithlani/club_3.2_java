package com.string;

import java.util.Scanner;

public class ToUpper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name...");
		String name  = sc.next();
		
		
		for(int i=0;i<name.length();i++) {
			//System.out.println(name.charAt(i));
			System.out.println(name.codePointAt(i)-32);
			System.out.println((char)65);
		}
		
		
		
	}
}
