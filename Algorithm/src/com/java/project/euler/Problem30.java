package com.java.project.euler;
/**
 * 자릿수 제곱을 다 더하면 자기 자신 나온는 것
 *
 */
public class Problem30 {
	public static void main(String[] args) {
		
		int a = 0;
		long b;
		int e = Integer.MAX_VALUE;
		String sE= String.valueOf(e);
		System.out.println(sE.length());
		long c;
		long d=0;
		for (int i = 2; i <= 999999; i++) {
			a=i;
			c=0;
			for (int j = 0; j < 6; j++) {
				c=c+(long) Math.pow(a%10, 5);
				a=a/10;
//				if(a==0){
//					break;
//				}
			}
//			443839
			if(i==c){
				System.out.println(i);
				d=d+i;
			}

		}
		
		System.out.println(d);

		
	} //end of main
} //end of class
