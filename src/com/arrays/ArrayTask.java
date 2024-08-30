package com.arrays;

import java.util.Scanner;

public class ArrayTask {

	int arr[];

	public void getData() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter no to set in array !!");
			int no = sc.nextInt();
			arr[i] = no;
		}

	}

	public void printData() {

		for (int i : arr) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		ArrayTask at = new ArrayTask();
		at.getData();
		at.printData();

	}
}
