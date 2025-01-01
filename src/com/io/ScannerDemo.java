package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		try {
			//Scanner sc = new Scanner(new File("C:\\Users\\Samir\\Desktop\\dictonry"));
			Scanner sc = new Scanner(new File("demo12.txt"));
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
