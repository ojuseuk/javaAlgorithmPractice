package com.java.project.euler;

public class Problem21 {
	public static void main(String[] args) {
//		n의 약수들 중에서 자신을 제외한 것의 합을 d(n)으로 정의했을 때,
//		서로 다른 두 정수 a, b에 대하여 d(a) = b 이고 d(b) = a 이면 
//		a, b는 친화쌍이라 하고 a와 b를 각각 친화수(우애수)라고 합니다.
//		예를 들어 220의 약수는 자신을 제외하면 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 이므로 그 합은 d(220) = 284 입니다.
//		또 284의 약수는 자신을 제외하면 1, 2, 4, 71, 142 이므로 d(284) = 220 입니다.
//		따라서 220과 284는 친화쌍이 됩니다.
//		10000 이하의 친화수들을 모두 찾아서 그 합을 구하세요.
		
		int sum1;
		int sum2;
		int sum3=0;
		for (int i = 2; i <= 10000; i++) {
			sum1=0;
			sum2=0;
			for (int j = 1; j < i; j++) {
				
				if(i%j==0){
					
					sum1 = sum1 + j;
				}
				
			}
			
			for (int j = 1; j < sum1; j++) {
				
				if(sum1%j==0){
					
					sum2 = sum2 + j;
				}
				
			}
			
			if(i == sum2 && sum1 != sum2){

				sum3 =sum3 + i; 
				System.out.println(i + " : " + sum1 + ", " + sum2);
				System.out.println("sum3 : " + sum3);
			}
			
		}
		System.out.println(sum3);
		
		
		
		
	} // end of main
} // end of class

