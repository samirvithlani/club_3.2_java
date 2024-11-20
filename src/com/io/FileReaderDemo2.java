package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) {
		
		long startmil = System.currentTimeMillis();
		System.out.println(startmil);
		try {
			FileReader reader = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			int c=0;
			while((c= reader.read())!=-1) {
				System.out.print((char)c);
			}
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
