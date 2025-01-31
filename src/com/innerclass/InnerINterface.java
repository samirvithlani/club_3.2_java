package com.innerclass;

interface Plannable{
	
	public void plan();
}

public class InnerINterface{

	
	
	
	//Annonymus inner class
	public static void main(String[] args) {
		
		Plannable plan = new Plannable() {
			
			@Override
			public void plan() {

				System.out.println("plannable...");
				
			}
		};
		plan.plan();
	}
}
