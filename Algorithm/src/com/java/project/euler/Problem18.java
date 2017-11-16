package com.java.project.euler;

import java.util.concurrent.SynchronousQueue;

public class Problem18 {
	public static void main(String[] args) {

		int[][] num = new int[15][15];
		
		num[0][0]= 75;
		int[] a2 = {95, 64};
		for (int i = 0; i < a2.length; i++) {
			num[1][i] = a2[i];
		}
		
		int[] a3 = {17, 47, 82};
		for (int i = 0; i < a3.length; i++) {
			num[2][i] = a3[i];
		}
		int[] a4 = {18, 35, 87, 10};
		for (int i = 0; i < a4.length; i++) {
			num[3][i] = a4[i];
		}
		int[] a5 = {20, 04, 82, 47, 65};
		for (int i = 0; i < a5.length; i++) {
			num[4][i] = a5[i];
		}
		int[] a6 = {19, 01, 23, 75, 03, 34};
		for (int i = 0; i < a6.length; i++) {
			num[5][i] = a6[i];
		}
		int[] a7 = {88, 02, 77, 73, 07, 63, 67};
		for (int i = 0; i < a7.length; i++) {
			num[6][i] = a7[i];
		}
		int[] a8 = {99, 65, 04, 28, 06, 16, 70, 92};
		for (int i = 0; i < a8.length; i++) {
			num[7][i] = a8[i];
		}
		int[] a9 = {41, 41, 26, 56, 83, 40, 80, 70, 33};
		for (int i = 0; i < a9.length; i++) {
			num[8][i] = a9[i];
		}
		int[] a10 = {41, 48, 72, 33, 47, 32, 37, 16, 94, 29};
		for (int i = 0; i < a10.length; i++) {
			num[9][i] = a10[i];
		}
		int[] a11 = {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14};
		for (int i = 0; i < a11.length; i++) {
			num[10][i] = a11[i];
		}
		int[] a12 = {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57};
		for (int i = 0; i < a12.length; i++) {
			num[11][i] = a12[i];
		}
		int[] a13 = {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48};
		for (int i = 0; i < a13.length; i++) {
			num[12][i] = a13[i];
		}
		int[] a14 = {63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31};
		for (int i = 0; i < a14.length; i++) {
			num[13][i] = a14[i];
		}
		int[] a15 = {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23};
		for (int i = 0; i < a15.length; i++) {
			num[14][i] = a15[i];
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%02d ", num[i][j]);
			}
			System.out.println();
		}
		
		int total=num[0][0];
		int sum;
		int aIndexi=0;
		int aIndexj=0;
		int cnt;
		for (int i = 1; i < num.length-1; i+=2) {
			sum=0;
			cnt=0;
			System.out.print(num[i][aIndexj] + " ? ");
			for (int j = aIndexj; j <= aIndexj+1; j++) {
				System.out.print("j:" + j + " ");
				if(num[i][j] !=0){
					if((num[i][j]+num[i+1][j]) >= (num[i][j]+num[i+1][j+1])){
						if((num[i][j]+num[i+1][j]) > sum){
							sum = (num[i][j]+num[i+1][j]);
							aIndexi = i+1;
							aIndexj = j;
						}
					}else if((num[i][j]+num[i+1][j]) <= (num[i][j]+num[i+1][j+1])){
						if((num[i][j]+num[i+1][j+1]) > sum){
							sum = (num[i][j]+num[i+1][j+1]);
							aIndexi = i+1;
							aIndexj = j+1;
						}
					}
					cnt++;
				}
				if(cnt >= 2){
					break;
				}
			}
			System.out.print( (sum-num[aIndexi][aIndexj]) + "+" + num[aIndexi][aIndexj] + " ");
			System.out.println(i + ":" + sum + ",j:" + aIndexj);
			total+=sum;
		}
		
		System.out.println(total);
		
		
	}// end of main
}// end of class















