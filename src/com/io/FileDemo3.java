package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
	
	
	public static void main(String[] args) {
		
		File file = new File("demo12.txt");
//		try {
//			if(file.createNewFile()) {
//				System.out.println("file created..");
//			}
//			else {
//				System.out.println("file not created...");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		if(file.exists()) {
			System.out.println("file is already exist!");
		}
		else {
			
			
			try {
				if(file.createNewFile()) {
					System.out.println("file created..");
				}
				else {
					System.out.println("file not created something went wrong");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}
}
