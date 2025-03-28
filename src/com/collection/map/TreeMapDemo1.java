package com.collection.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		
		TreeMap<String,Integer> map = new TreeMap<String, Integer>();
		map.put("sachin", 100);
		map.put("virat", 82);
		map.put("ponting", 71);
		map.put("kumar", 63);
		map.put("jack", 62);
		
		for(Entry e:map.entrySet()) {
			System.out.println(e.getKey() +  " "+e.getValue());
		}
		
		
		System.out.println(map.ceilingKey("lumber"));
		System.err.println(map.floorKey("v"));
		
		System.out.println(map.firstEntry());
		//map.lastEntry()
		//map.get("virat");
		SortedMap<String, Integer> ss = map.subMap("jk", "virat");
		ss=map.headMap("kumar");
		ss=map.tailMap("kumar");
		
		NavigableMap<String,Integer> nmap = map.descendingMap();
		
		//map.pollFirstEntry();
		map.pollLastEntry();
		
		System.out.println("------------------------------");
		
		for(Entry e:nmap.entrySet()) {
			System.out.println(e.getKey() +  " "+e.getValue());
		}
		
		
		
		
	}
}
