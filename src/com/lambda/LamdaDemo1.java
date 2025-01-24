package com.lambda;

interface Playable{
	
	public void play();
}

//public class LamdaDemo1 implements Playable {
//
//	@Override
//	public void play() {
//
//		System.out.println("playimg....");
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		
//		Playable p1 = new LamdaDemo1();
//		p1.play();
//		
//	}
//}
public class LamdaDemo1  {


	
	public static void main(String[] args) {
		
		
		Playable p1 = ()->{
			
			System.out.println("playing...");
		};
		
		p1.play();
		
	}
}
