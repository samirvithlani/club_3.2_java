package com.enums;

import java.util.Calendar;

enum Seasons{
	
	summer(40),winter(25),monsoon(30);
	
	int value;
	private Seasons(int value) {
		
		this.value = value;
	}
	
	
	
}

public class EnumDemo2 {

	public static void main(String[] args) {
		
		//System.out.println(Seasons.monsoon + " "+Seasons.monsoon.value);
		
		for(Seasons s:Seasons.values()) {
			System.out.println(s);
		}
	}
}
