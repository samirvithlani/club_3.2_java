package com.methods;

import java.util.Scanner;

class Royal {

	int fees;
	String name;

	public Royal(int fees, String name) {

		this.fees = fees;
		this.name = name;
	}
	
	public Royal() {
		// TODO Auto-generated constructor stub
	}

}

public class MethodObject2 {

	public void printStudent(Royal ryl[]) { //0 //1 //2
		System.out.println(ryl);
		for (Royal r : ryl) {
			System.out.println("Student name = " + r.name + " student fees = " + r.fees);
		}
	}

	public static void main(String[] args) {

		MethodObject2 m2 = new MethodObject2();
//		Royal stu1 = new Royal(100, "jay");
//		m2.printStudent(stu1);
//		m2.printStudent(new Royal(200, "jeet"));
//		

		//Royal r1[] = new Royal[3];
		Royal r1[]  = new Royal[3]; //0[] 1[]/3[]
		System.out.println(r1);
		
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<r1.length;i++) {
			
			////i[] i[] i[]
			r1[i] = new Royal();
			//r1[0] = new Royal;
			//r1[i] = new Royal
			System.out.println("enter fees:");
			int fees = sc.nextInt();
			r1[i].fees=fees;
			//r1[0] = fees
			//r1[1] = fees
			System.out.println("enter name:");
			String name = sc.next();
			r1[i].name=name;			
			
		}
		m2.printStudent(r1);

	}
}
