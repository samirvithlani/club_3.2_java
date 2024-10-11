package com.date;

import java.util.Calendar;

public class CalanderDemo3 {

	
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.HOUR, -1);
		System.out.println(c.getTime());
		
		
	}
}
