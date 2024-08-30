package com.enums;

public class EnumDemoArray {
	
	enum TimeTable{
		
		
		monday(new String[]  {"java","cpp"}),
		tuesday(new String[]  {"java","cpp","c"}),
		wednesday(new String[]  {"java","cpp","python"});
		
		String str[];
		
		private TimeTable(String str[]) {
			
			this.str  = str;
		}
		
		
	}

	public static void main(String[] args) {
		
		
		
		for(String s:TimeTable.wednesday.str) {
			System.out.println(s);
		}
		
		
		
	}
}
