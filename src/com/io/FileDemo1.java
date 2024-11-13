package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	// java.io
	// java.nio
	// "./"
	// "../"
	public static void main(String[] args) {

		File file = new File("abc1.txt");
		try {
			if (!file.exists()) {
				if (file.createNewFile()) {
					System.out.println("file created.");
				} else {
					System.out.println("file not created.");
				}
			} else {

				System.out.println("file already exist,,");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
