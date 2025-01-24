package com.lambda;


interface Calc{
	
	
	public int sum(int a,int b);
}

public class LambdaDemo2 {

	
	public static void main(String[] args) {
		
		
		Calc c = (a,b)->{
			
			return a + b;
			//sum
		};
		
		int ans = c.sum(100, 200);
		System.out.println("ans = "+ans);
	}
}
