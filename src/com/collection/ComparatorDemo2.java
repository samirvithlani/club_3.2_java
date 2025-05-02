package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Songs implements Comparator<Songs>{
	
	int ratings;
	float minutes;
	String name;
	
	public Songs(int ratings, float minutes, String name) {
		
		this.ratings = ratings;
		this.minutes = minutes;
		this.name = name;
	}
	
	public Songs() {
		
	}

	@Override
	public int compare(Songs o1, Songs o2) {
		// TODO Auto-generated method stub
		//return Float.compare(o1.minutes, o2.minutes);
		return o1.name.compareTo(o2.name);
	}
	
	
	
	
}

public class ComparatorDemo2 {

	public static void main(String[] args) {
		
		List<Songs> songs = new ArrayList<Songs>();
		songs.add(new Songs(5, 4.5f, "beliver"));
		songs.add(new Songs(4, 4.9f, "abcd"));
		songs.add(new Songs(4, 4.6f, "baby"));
		
		
		
		
		songs.sort(new Songs());
		
		for(Songs s: songs) {
			System.out.println(s.name + " ==  "+s.minutes + " == "+s.ratings);
		}
			
		
	}
}
