package com.oops.abstraction;


interface Meta{
	
	public void chat();
	
}
interface Fb extends Meta{
	
	public void friends();
	
}


public class FaceBook implements Fb {

	public void chat() {}
	public void friends() {}
	
	public static void main(String[] args) {
		
//		Fb f = new FaceBook();
//		f.friends();
//		f.chat();
		
		
		Meta m = new FaceBook();
		m.chat();
		
	}
}
