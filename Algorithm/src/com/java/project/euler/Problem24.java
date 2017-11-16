package com.java.project.euler;

public class Problem24 {
	static int a=0;
	public static void main(String[] args) {
//3,4,5,6,7,8,9
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		perm(arr, 0);
		
		
	} // end of main
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void perm(int[] arr, int early){
		
		if(early == arr.length){
			
			insertion(arr);
		}
		
		for (int i = early; i < arr.length; i++) {
			swap(arr, i, early);
			perm(arr, early+1);
			swap(arr, i, early);
		}
		
	}
	
	public static void insertion(int[] arr){
		
		int sum =1;
		for (int i = arr.length; i >=1 ; i--) {
			sum = sum * i;
		}
		int[][] numArr = new int[sum][arr.length];
		
		System.out.print(a + ": ");
//		for (int i = 0; i < numArr.length; i++) {
//			System.out.print(i + ": ");
			for (int j = 0; j < arr.length; j++) {
				numArr[a][j] = arr[j];
				System.out.print(numArr[a][j] + ",");
				if(a==1000000){
					for (int b = 0; b < 10; b++) {			
						System.out.print("´ä: " + numArr[1000000][b]);
					}
					break;
				}
			}
			System.out.println();
//		}

		a++;
		


		
	}
	
} // end of class


