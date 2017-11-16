import java.awt.PageAttributes;
import java.util.Arrays;
import java.util.Scanner;

/**
 *	n 진법의 나머지 구하기 
 *
 */
public class Proposition {
	public static void main(String[] args) {
//	b진법의 양의 정수 p와 m이 주어질 때, p를 m으로 나누었을 때의 나머지를 구하는 프로그램을 구하라.
	
	Scanner scan = new Scanner(System.in);
	
//	System.out.print("진법수 입력 : ");
//	System.out.print("수 입력 : ");
//	System.out.print("수 입력 : ");
	System.out.println("진법수, 수입력, 수입력 하시오");
	int b = scan.nextInt();
	String p = scan.next();
	String m = scan.next();
	int remainder; 					//나머지
	
	
	if(b < 10){
		String[] pA = p.split("");
//		System.out.println(Arrays.toString(pA) + pA.length);
		String[] mA = m.split("");
//		System.out.println(Arrays.toString(mA) + mA.length);
		
		int sumP=0;
		int sumM=0;
		// p를 진수 변환
		for (int i = pA.length-1; i >= 0; i--) {
			
			int pAint = Integer.parseInt(pA[i]);
			sumP=sumP+(int)(pAint*(Math.pow(b, pA.length-1-i)));
		}
		System.out.println(sumP);
		
		for (int i = mA.length-1; i >=0 ; i--) {
			int mAint = Integer.parseInt(mA[i]);
			sumM = sumM + (int)(mAint*(Math.pow(b, mA.length-1-i)));
		}
		System.out.println(sumM);
		remainder = sumP%sumM;
		System.out.println(remainder);
		int share=remainder;	//몫
		int[] remain = new int[10];			//나머지
		int i=0;				//진수 위치
		while(true){
			
			remain[i]=share%b;	//나머지(진수값)
			share=share/b;	//몫
//			System.out.println(Arrays.toString(remain));
			System.out.print(i+"번: "+ share + ",");

			if(share <= 0){
				break;
			}
			i++;
		}
		
//		System.out.println(i);
		System.out.println(Arrays.toString(remain));
		for (int j = i; j >= 0; j--) {
			System.out.print(remain[j]);
		}
		

	}else{
		int pInt = Integer.parseInt(p);
		int mInt = Integer.parseInt(m);
		
		remainder = pInt%mInt;
		System.out.println(remainder);	
	}
	
	
	
	
	
	
	
	} // end of main
} // end of class














