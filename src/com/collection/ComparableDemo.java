package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Mobile implements Comparator<Mobile>{
	
	int price;
	String name;
	
	public Mobile(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		//return Integer.compare(o1.price, o2.price);
		/* if(o1.price>p2.price) retutn 1
		 * if(o1.price<o2.price) return -1
		 * if(o1.price==o2.price) return 0;
		 * 
		 * */
		//return Integer.compare(o1.price, o2.price);
		return o1.name.compareTo(o2.name);
	}

	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	
}

public class ComparableDemo {

	
	public static void main(String[] args) {
		
		TreeSet<Mobile> mobiles = new TreeSet<Mobile>(new Mobile());
		Mobile m1 = new Mobile(1200,"iphone16");
		mobiles.add(m1);
		mobiles.add(new Mobile(1300, "iphone16+"));
		mobiles.add(new Mobile(600, "mi-oppo"));
		
		for(Mobile m : mobiles) {
			System.out.println(m.name + " "+ m.price);
		}
		
		
		
	}
}
