package com.java.project.euler;

import java.math.BigInteger;

public class Problem20 {
	public static void main(String[] args) {
		
		BigInteger bigNum = new BigInteger("1");

		for (int i = 1; i <= 100; i++) {
			
			bigNum = bigNum.multiply(BigInteger.valueOf(i));
		}
//		System.out.println(bigNum);
		                            
		String str = String.valueOf(bigNum);
		String[] strArr = str.split("");
		
		int sum=0;
		for (int i = 0; i < strArr.length; i++) {
			sum += Integer.valueOf(strArr[i]);
		}
		System.out.println(sum);
		
	}// end of main
}// end of class
