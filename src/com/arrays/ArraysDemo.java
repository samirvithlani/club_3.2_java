package com.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {

		int a[] = new int[] { 90, 12, 33, 45, 66, 77, 1, 345 };
		// Arrays.sort(a);
		// Arrays.parallelSort(a);
//		for(int i:a) {
//			System.out.println(i);
//		}

		int x = Arrays.binarySearch(a,90);
		System.out.println("x ->"+x);
		
		int aa[] = Arrays.copyOf(a, 3);
		for(int i:aa) {
			System.out.println(i);
		}
	}
}
