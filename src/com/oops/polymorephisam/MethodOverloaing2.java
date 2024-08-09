package com.oops.polymorephisam;

public class MethodOverloaing2 {

	
			public static void doStuff(Integer x , Integer y) 
			{
			System.out.println("Integer.. sum is " + (x + y));
			}
//			public static void doStuff(int x , int y) 
//			{
//			System.out.println("Integer sum is " + (x + y));
//			}
			public static void doStuff(double x , double y) 
			{
			System.out.println("double sum is " + (x + y));
			}
			public static void doStuff(float x , float y) 
			{
			System.out.println("float sum is " + (x + y));
			}
			public static void main(String[] args) 
			{
				//doStuff(new Integer(20),new Integer(20));
				//doStuff(new Float(20),new Float(20));
				//doStuff(new Float(12), new Float(12));
				//doStuff(10,20);
				doStuff(new Integer(10), new Integer(20));
				doStuff(10.0,20.0);
				
			}
			
			
			

}
