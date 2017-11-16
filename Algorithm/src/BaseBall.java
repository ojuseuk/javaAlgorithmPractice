import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 *
 */
public class BaseBall {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int askCnt = scan.nextInt();
		String ask = "";
		int strike =0;
		int ball = 0;
		
		String[] askNum = new String[askCnt];
		int[] strikeNum = new int[askCnt];
		int[] ballNum = new int[askCnt];
		
		for (int i = 0; i < askCnt; i++) {
			askNum[i] = scan.next();
			strikeNum[i] = scan.nextInt();
			ballNum[i] = scan.nextInt();
			
		}
		
		System.out.println(askCnt);
		System.out.println(Arrays.toString(askNum));
		System.out.println(Arrays.toString(strikeNum));
		System.out.println(Arrays.toString(ballNum));
		
		
		
		
		
		
	} // end of main
} // end of class











