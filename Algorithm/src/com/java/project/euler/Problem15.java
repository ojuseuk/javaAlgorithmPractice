package com.java.project.euler;

public class Problem15 {
	public static void main(String[] args) {

		long[][] square = new long[21][21];
		
		
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square.length; j++) {
				
				square[0][j] = 1;
				square[i][0] = 1;
				if(i>=1 && j>=1){
					square[i][j]=square[i-1][j]+square[i][j-1];
				}
				System.out.print(square[i][j]);
			}
			System.out.println();
		}
		System.out.println(square[20][20]);
		
		
		
		
	}// end of main
}// end of class















