package com.io;

import java.io.File;

public class FileDemo2 {

	
	public static void main(String[] args) {
		
		
		//File file = new File("src//com//io//demo");
		
		//file.mkdir();
		
//		File file = new File("demo//a//b//c//d//e");
//		file.mkdirs();
//		
		File file = new File("abc.txt");
		//exist..
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		
	}
}
