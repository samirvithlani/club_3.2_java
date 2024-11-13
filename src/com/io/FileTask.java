package com.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTask {

	public static void main(String[] args) {

		System.out.println("Enter file name :");
		System.out.println("Enter Folder name :");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.next();
		String foldName = sc.next();

		File fold = new File(foldName);
		if (fold.exists()) {
			System.out.println("folder already exist..");
		} else {
			if (fold.mkdir()) {

				System.out.println("folder created...");

			} else {

				System.out.println("something went wrong...");

			}
		}

		/// file creation logic..
		File file = new File(foldName + "//"+ fileName);
		if (file.exists()) {
			System.out.println(fileName + " is already exist  ");
		} else {

			try {
				if (file.createNewFile()) {
					System.out.println("file created... ");
				} else {
					System.out.println("file not created...");
				}
			} catch (IOException e) {
				// TODO: handle exception
			}
		}

	}
}
