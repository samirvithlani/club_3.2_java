package com.collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	
	public static void main(String[] args) {
		
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("amit");
		ts.add("raj");
		ts.add("kunal");
		ts.add("amit");
		ts.add("tirth");
		
		
		NavigableSet<String> ns = ts.descendingSet();
		//SortedSet<String>ss = ts.subSet("amit", "raj");
		SortedSet<String>ss = ts.subSet("amit", true, "zaa", true);
		ss = ts.headSet("tirth");
		ss= ts.tailSet("kunal");
		
		System.out.println("first..."+ts.first());
		System.out.println("floor"+ts.floor("kuna"));
		System.out.println("cel."+ts.ceiling("kuna"));
		
		System.out.println("removing..."+ts.pollFirst());
		//ts.pollLast();
		
		
		for(String s:ss) {
			System.out.println(s);
		}
		
	}
}
