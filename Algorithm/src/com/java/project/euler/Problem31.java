package com.java.project.euler;

public class Problem31 {
	public static void main(String[] args) {
//		영국의 화폐 단위는 파운드(£)와 펜스(p)이고, 동전의 종류는 아래와 같습니다.
//		1p, 2p, 5p, 10p, 20p, 50p, £1 (100p), £2 (200p)
//		이 동전들을 가지고 2파운드를 만드는 방법은 다양할 것입니다. 예를 하나 들면 이렇습니다.
//		1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
//		2파운드를 만드는 서로 다른 방법은 모두 몇가지나 있습니까?
		
		int f1 = 100; int p50 = 50; int p20 = 20; int f2 = 200;
//		최대 2개			최대 4개			최대 10개		최대 1개
		int p10 = 10; int p5 = 5; int p2 = 2; int p1 = 1;
//		최대 20개			최대 40개		최대 100개		최대 200개
		
		long x=0;
		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 4; b++) {
				for (int c = 0; c <= 10; c++) {
					for (int d = 0; d <= 20; d++) {
						for (int e = 0; e <= 40; e++) {
							for (int f = 0; f <= 100; f++) {
								for (int g = 0; g <= 200; g++) {
									
									if(((100*a)+(50*b)+(20*c)+(10*d)+(5*e)+(2*f)+(1*g)) == 200){
										x++;
										break;
									}
									
								}
							}
						}
					}
				}
			}
		} // end of for(마지막)
		
		//200파운드 한개 짜리 추가
		System.out.println(x+1);
		
		
		
		
		
		
		
		
		
	}//end of main
}//end of class




















