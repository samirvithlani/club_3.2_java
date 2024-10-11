package com.date;

import java.util.Calendar;

//00 : utc
//00 + 5:30  //IST
//timezone // cst isit
public class CalanderDemo1 {

	
	public static void main(String[] args) {
		
		
		Calendar c =Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)); //january on zero index
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		
		System.out.println("week of month.."+c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("week of year"+c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		//System.out.println(c.get(Calendar.ERA));
		System.out.println(c.get(Calendar.ZONE_OFFSET));
		
				
		
	}
}
