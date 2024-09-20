package com.string;

public class RemoveDuplicate {

	
	public static void main(String[] args) {
		
		
		int arr[] = new int[]{10,20,40,50,10,20,22};
		int size = arr.length;
		int unique[]=new int[size];
		
		int usize=0;
		
		//i=1
		for(int i=0;i<arr.length;i++) {
		
			
			boolean isD =false; //false
			//
			for(int j=0;j<usize;j++) {
				System.out.println("j ="+j); //0//1
				System.out.println("i.. = "+i);
				//a[1]=u[0]
				if(arr[i] == unique[j]) {
					isD= true;
					break;
				}
				
				
			}
			
		
			if(isD==false) {
				
				
				//0 = 0
				//1 = 0
				System.out.println("isD"+isD);
				System.out.println("i = "+i);
				unique[usize] = arr[i];
				usize++; //1
				System.out.println("usize "+usize);
				
				
			}
			
		
		
			
		}
		
		
		
		
		
//		for(int i:unique) {
//			System.out.println(i);
//		}
		
		
	}
}
