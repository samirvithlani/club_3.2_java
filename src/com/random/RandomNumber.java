package com.random;

import java.util.Random;

public class RandomNumber {

	
	public static void main(String[] args) {
		
		String names [] = {"jeet","jay","parth","samir"};
		
		
		Random random = new Random();
		int randomIndex = random.nextInt(4);
		System.out.println(randomIndex);
		System.out.println(names[randomIndex]);
		
		
	}
}
