package com.innerclass;

public class InnerClassDemo {
	
	
	public class Inner{
		//inner class...
		
		public void innerTest() {
			System.out.println("inner class test method...");
		}
		
	}
	
	private final static class Inner2{
		
		public void inner2Test() {
			System.out.println("inner2 test class....");
		}
	}

	
	public static void main(String[] args) {
		
//		InnerClassDemo obj = new InnerClassDemo();
//		InnerClassDemo.Inner in2 =obj.new Inner();
//		in2.innerTest();
		
		
		InnerClassDemo.Inner2 in2 = new Inner2();
		in2.inner2Test();
		
		
		
		
	}
}
