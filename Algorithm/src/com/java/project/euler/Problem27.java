package com.java.project.euler;

public class Problem27 {
	public static void main(String[] args) {

		int num = 1;
		long sum = 1;
		
		for (int i = 2; i <= 1001; i+=2) {
			
			for (int j = 1; j <= 4; j++) {
				sum = sum + (num + (i*j));

			}
			num = i*4 + num;
		}
		
		System.out.println(sum);
		
		
	} // end of main
} // end of class















