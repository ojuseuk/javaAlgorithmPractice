package com.java.project.euler;

public class Problem34 {
	public static void main(String[] args) {

		
		int a = Integer.MAX_VALUE;			//정수 최대값
		int aLength;						//길이
		int b;								//자릿수
		int c;								//팩토리얼  값
		int f;								//팩토리얼 더한 값
		long d=0;								//정답
		int e;								//i대신 넣어주는 값
		
		for (int i = 3; i < a; i++) {
			c=1; b=0; e=i; f=0;
			aLength=String.valueOf(i).length();		//길이
			for (int j = 0; j < aLength; j++) {
				b = e%10;
				for (int k = b; k >= 1; k--) {
					c=c*k;
				}
				f=f+c;
				c=1;
				e=e/10;
			}
			if(i==f) {
				d=d+i;
				System.out.println(i);
			}
		}
	
	System.out.println(d);
	
	
	
	
	
	} // end of main
} // end of class


















