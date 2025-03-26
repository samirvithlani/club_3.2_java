package com.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	
	public static void main(String[] args) {
		
		//key value pair...
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(101, "ram");
		map.put(104, "ram");
		map.put(103, "ram");
		map.put(106, "ram");
		map.put(101, "shyam");
		
		
		//System.out.println("removing..."+map.remove(103));
		//map.remove(103, "rama");
		
		System.out.println(map.containsKey(103));
		System.out.println("value..."+map.containsValue("shyam"));
		
		System.out.println("get..."+map.get(106));
		
		Set<Integer>keys =  map.keySet();
		
		for(int i:keys)
		{
			System.out.println(i);
		}
		
		
		//Set<String> values = (Set<String>) map.values();// values
		
		//iterate...
		for(Entry m:map.entrySet()) {
			
			System.out.println(m.getKey() + " "+m.getValue());
		}
		
		
		
		
		
	}
}
