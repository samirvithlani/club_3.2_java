package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMM/dd");
		//SimpleDateFormat sdf = new SimpleDateFormat("yy/MMM/dd");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMM/dd  hh::mm::ss");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMM/dd  hh::mm::ss zzzz");
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMM/dd  hh::mm::ss a ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd  hh::mm::ss a EEEE");
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		
		
	}
}
