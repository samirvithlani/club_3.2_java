package com.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	
	public static void main(String[] args) {
		//BufferdWriter Demo
		
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("br1.txt"));
			br.write("hello");
			br.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
