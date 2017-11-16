import java.util.Scanner;

/**
 * 배열 나선형or달팽이
 *
 */
public class Snail {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("행");
		int number1 = scan.nextInt();
		System.out.println("열");
		int number2 = scan.nextInt();
		int su=0;			//배열에 들어갈 수 
		int a=0;			//배열 행
		int b=0;			//배열 열
		int s=1;			//1-오른쪽, 2-아래, 3-왼쪽, 4-위 방향 
		int[][] snail = new int[number1][number2];
		
//		for (int i = 0; i < snail.length; i++) {
//			for (int j = 0; j < snail[i].length; j++) {
//				snail[i][j] = 0;
//				System.out.printf("%2d", snail[i][j]);
//			}
//			System.out.println();
//		}
		
		
		while(su < number1*number2){

			switch (s) {
			case 1:					//오른쪽
				snail[a][b++] = su++;
				if(b==number2-1 || snail[a][b+1] != 0){	//처음 || 두번째 부터(다음값이 0이 아니면 방향 전환)
					s++;
				}
				break;
			case 2:					//아래
				snail[a++][b] = su++;
				if(a==number1-1 || snail[a+1][b] != 0){	//처음 || 두번째 부터(다음값이 0이 아니면 방향 전환)
					s++;
				}
				break;
			case 3:					//왼쪽
				snail[a][b--] = su++;
				if(b==0 || snail[a][b-1] != 0){			//처음 || 두번째 부터(다음값이 0이 아니면 방향 전환)
					s++;
				}
				break;
			case 4:					//위
				snail[a--][b] = su++;
				if(a==1 || snail[a-1][b] != 0){			//처음 || 두번째 부터(다음값이 0이 아니면 방향 전환)
					s=1;								//위로 갔으니 다음 오른쪽으로 움직일수 있도록 초기화
				}
				break;
			default:
				break;
			}

		} // end of while
		
		for (int i = 0; i < snail.length; i++) {
			for (int j = 0; j < snail[i].length; j++) {
				System.out.printf("%3d", snail[i][j]);
			}
			System.out.println();
		}
		
		
	} // end of main
} // end of class