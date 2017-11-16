package com.java.project.euler;

import java.math.BigInteger;

import javax.lang.model.util.ElementFilter;

/**
 * 피보나치 수열
 *
 */
public class Problem25 {
	public static void main(String[] args) {

		BigInteger bigNum = new BigInteger("100000000");
		
		BigInteger[] num = new BigInteger[bigNum.intValue()];
		String[] strNum = new String[bigNum.intValue()];
		num[0] = BigInteger.ZERO;
		num[1] = BigInteger.ONE;
		strNum[0] = "1";
		strNum[1] = "1";
		
		for (int i = 2; i < num.length; i++) {
			num[i] = num[i-1].add(num[i-2]);
			strNum[i] = String.valueOf(num[i]);
			System.out.println(num[i]);
			if(strNum[i].length() == 1000){
				System.out.println(i);
				break;
			}
				
		}
		
		
		
		
		
		
		
	} // end of main
} // end of class














