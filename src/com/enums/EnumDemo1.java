package com.enums;

//enum is nothing but kind a class..
//all variable are declare inside enums are consider as object of that enum
//all objects are final static
//enum can declare inside class and also 

public class EnumDemo1 {
	
	enum Months{
		//Months jan = new Months();
		jan,feb,march,april,may,june,july,aug,sep,oct,nov,dec;
	}

	
	public static void main(String[] args) {
		
		
		System.out.println(Months.jan);
		
	}
}
