package com.wrapper;

public class WrapperDemo {

	
	public static void main(String[] args) {
		
		
		Integer i =new Integer(100);
		System.out.println(i);
		
		Integer no = new Integer("100");
		System.out.println(no);
		
		byte b = i.byteValue();
		System.out.println(b);
		
		double d = i.doubleValue();
		System.out.println(d);
		
		//i.floatValue();
		//int x = i.intValue();
		System.out.println(Integer.hashCode(i));//1.8
		
		System.out.println(Integer.min(100, 20)); //1.8

		System.out.println(Integer.max(100, 900));
		
		//getInteger...
		
		String str ="89";
		
		int myno = Integer.parseInt(str);
		System.out.println(myno);
		              //16-1 
		//2 bytes // 2
		
		//-32768 to + 32767
		Long l = Integer.toUnsignedLong(-100);
		String s = Integer.toUnsignedString(-200);
		System.out.println(s);
		System.out.println(l);
		
		
		System.out.println(Integer.compare(110,200));
		System.out.println(Integer.toBinaryString(5));
		
		
		
		
		
	}
}
