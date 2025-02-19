package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add(0,"c");
		list.add(0,"cpp");
		list.add("python");
		list.add("js");
		
		System.out.println(list.get(0));
		
		System.out.println("remving...."+list.remove(0));
		System.out.println("is removed??" + list.remove("pyThon"));
		
		System.out.println("contains..."+list.contains("js"));
		
		int index = list.indexOf("js");
		//int index = list.lastIndexOf("js");
		//System.out.println("index = "+index);
		
		
		list.clear();
		System.out.println(list.isEmpty());
		
		
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		for(String s:list) {
			System.out.println(s);
		}
	}
}
