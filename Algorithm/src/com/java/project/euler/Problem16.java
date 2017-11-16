package com.java.project.euler;

public class Problem16 {
	public static void main(String[] args) {
		
		double number = Math.pow(16, 250);
//		System.out.println(number);
		
		int[] num = new int[1000];
		
		for (int i = 1; i <= 1000; i++) {
			
			for (int j = num.length-1; j >= 0; j--) {
				
			}
		}
		
		String s=String.valueOf(number);
		System.out.println(s);
		String[] a=s.split("E");
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
//			sum = sum+Integer.parseInt(a[i]);
		}
		
//		System.out.println(sum);
		
	}//end of class
}//end of class
