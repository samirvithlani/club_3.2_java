package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {

	
	public static void main(String[] args) {
		
		long startmil = System.currentTimeMillis();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Samir\\Desktop\\dictonry"));
			String data =null;
			while((data = reader.readLine())!=null) {
				System.out.println(data);
			}
			reader.close();
			long endMil = System.currentTimeMillis();
			long gap = endMil-startmil;
			System.out.println("total mils taken "+gap );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
