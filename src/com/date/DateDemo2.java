package com.date;

import java.util.Date;

public class DateDemo2 {

	
	public static void main(String[] args) {
		
		
		Date today = new Date();
		Date tomDate = new Date();
		tomDate.setDate(12);
		
		System.out.println(today);
		System.out.println(tomDate);
		
		
		System.out.println(today.after(tomDate));
		System.out.println(today.before(tomDate));
		
		
		
		
	}
}
