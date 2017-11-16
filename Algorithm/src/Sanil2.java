import java.util.Scanner;

/**
 * 달팽이 알골
 *
 */

public class Sanil2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("크기(숫자)를 입력하시오.(정사각형) : ");
		int num1 = sc.nextInt();
		
		String[][] sanil = new String[num1][num1]; 
		int i=0;								//행
		int j=0;								//열
		
		for (int j2 = 0; j2 < sanil.length; j2++) {
			for (int k = 0; k < sanil[j2].length; k++) {
				sanil[j2][k] = "□";
//				System.out.print(sanil[j2][k] + j2 + k);
			}
//			System.out.println();
		} //end of for
		int sum=0;
		for (int a = 1; a <= num1; a++) {
			sum+=a;
		}
		int s=1;
		int cnt=1;
		while(cnt < sum+1){
//			System.out.println(cnt);
//			System.out.println(i + " "+ s + " " + j);
			switch (s) {
			case 1:						//오른쪽
				sanil[i][j++] = "■";
				if(j==num1-1){
					s++;
				}else if(("■".equals(sanil[i][j+1]))){
					s++;
					j--;
					i++;
				}
				break;
			case 2:						//아래
				sanil[i++][j] = "■";
				if(i==num1-1){
					s++;
				}else if(("■".equals(sanil[i+1][j]))){
					s++;
					i--;
					j--;
				}
				break;
			case 3:						//왼쪽
				sanil[i][j--] = "■";
				if(j==1){
					s++;
				}else if(("■".equals(sanil[i][j-1]))){
					s++;
					j++;
					i--;
				}
				break;
			case 4:						//위
				sanil[i--][j] = "■";
				if(i==2){
					s=1;
				}else if(("■".equals(sanil[i-1][j]))){
					s=1;
					i++;
					j++;
				}
				break;

			default:
				break;
			}
			cnt++;
			
			

		}//end of while
		
		
		for (int k = 0; k < sanil.length; k++) {
			for (int k2 = 0; k2 < sanil[k].length; k2++) {
				System.out.printf("%2s", sanil[k][k2]);
			}
			System.out.println();
		}

		
	}//end of main
}//end of class


