package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo7 {

	public static void main(String[] args) {
		
		
		
		try {
			Scanner sc = new Scanner(new File(""));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
