package com.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo6 {

	
	public static void main(String[] args) {
		
		
		
		File file = new File("abc.txt");
		try {
			file.createNewFile();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
