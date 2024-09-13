package com.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};
        int n = arr.length;

        
        int[] uniqueArr = removeDuplicates(arr, n);

        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr, int n) {
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (!isMember(temp, j, arr[i])) {
                temp[j++] = arr[i]; 
            }
        }

        int[] uniqueArr = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArr[i] = temp[i];
        }

        return uniqueArr;
    }

    public static boolean isMember(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return true; 
            }
        }
        return false; 
    }
}
