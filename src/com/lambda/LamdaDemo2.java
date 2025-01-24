package com.lambda;

interface Runnable1{
	
	public void run();
}

public class LamdaDemo2 {

	public static void main(String[] args) {
		
		
		
		
		Runnable1 r1 = ()->{
			
			for(int i=1;i<10;i++) {
				System.out.println("i ="+i);
			}
		};
		
		r1.run();
		
	}
}
