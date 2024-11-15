package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		
		try {
			//FileWriter writer = new FileWriter("fw1.txt");
			FileWriter writer = new FileWriter("fw1.txt",true);
			writer.write("\nHi this is first File..");
			writer.close();
			System.out.println("data write successfully!!");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
