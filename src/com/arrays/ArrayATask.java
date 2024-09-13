package com.arrays;

public class ArrayATask {

	//[12.34.55.67.1]
	//34
	public int indexOf(int arr[], int elm) {

		int flag = -1;

		for (int i = 0; i < arr.length; i++) {

			//12 == 34 false
			//34 == 34 true
			if (arr[i] == elm) {
				flag = i;
				break;

			}
		}
		return flag;

	}

	public static void main(String[] args) {

		
		ArrayATask a1 = new ArrayATask();
		System.out.println(a1.indexOf(new int[] {12,22,45,34,1,456}, 222));
		
		
	}
}
