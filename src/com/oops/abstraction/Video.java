package com.oops.abstraction;

abstract class Google{
	
	
	public abstract void channel();
	
}

abstract class Youtube extends Google{
	
	public void channel() {
		System.out.println("yt call");
	};
	
}

public class Video extends Youtube {

	public void channel() {
		System.out.println("video call");
	};
	
	public static void main(String[] args) {
		
		
//		Google g = new Video();
//		g.channel();
		
		Youtube y = new Video();
		y.channel();
		
	}
}
