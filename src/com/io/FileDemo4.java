package com.io;

import java.io.File;

public class FileDemo4 {

	
	public static void main(String[] args) {
		
		
		File file = new File("new_folder");
		if(file.exists()) {
			
			System.out.println("folder already exist!");
		}
		else {
			if(file.mkdir()) {
				System.out.println("folder creted..");
			}
			else {
				System.out.println("folder creation failed..");
			}
		}
		
		
		
	}
}
