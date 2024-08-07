package com.accessmodi2;

import com.asseccmodifiers.AccessModi1;

public class AccessModiDiffChild extends AccessModi1{

	
	public void x() {
		System.out.println(p);
		//System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		AccessModi1 a = new AccessModi1();
		//System.out.println(a.d);
		//System.out.println(a.p);
	}
}
