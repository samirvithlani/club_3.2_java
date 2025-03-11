package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(20);
		list.add(200);
		list.add(30);
		list.add(400);
		
		List<Integer> ss = list.subList(1, 3);
		
		
		for(int i:ss) {
			System.out.println(i);
		}
		
		
		
//		List<Integer> list = Arrays.asList(10,20,21,22,34,55);
//		//list.add(100);
//		
//		for(int u:list) {
//			System.out.println(u);
//		}
	}

}
