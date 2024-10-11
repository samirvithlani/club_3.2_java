package com.date;

import java.util.Date;

public class DateDemo1 {

	
	public static void main(String[] args) {
		
		//java.util.Date
		//java.util.Calander
		
		Date date = new Date();
		//Date date = new Date(0l);
		//0 January
		//1 Feb
		//1900 + 2007
		//Date date = new Date(107, 2, 14);
		
		System.out.println(date);
		
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
		
		//date.setDate(date);
		
		
		
		
	}
}
