package com.java.project.euler;

import java.util.Arrays;
import java.util.Scanner;

public class Problem14 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int num = scan.nextInt();
//		int cnt=0;
//		while(true){
//			
//			if(num%2 ==0){
//				num=num/2;
//			}else{
//				num=3*num+1;
//			}
//			cnt++;
//			if(num==1) break;
//			
//		}
//		
		long num=0;
		long cnt;
		long[] cntArr = new long[1000001];
		for (int i = 1; i <= 1000000; i++) {
			num=i;
			cnt=0;
			while(true){
				cnt++;
				if(num%2 ==0){
					num=num/2;
				}else if(num%2 !=0){
					num=3*num+1;
				}
				
				if(num ==1){
					cntArr[i]=cnt;
					System.out.println(i +" " +cntArr[i]);
					break;
				}
				
			}
		}
		int maxIndex=0;
		for (int i = 0; i < cntArr.length; i++) {
			
			if(cntArr[maxIndex] < cntArr[i]){
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
		
		
		
		
		
		
		
		
	}//end of main
}// end of class










