import java.util.Scanner;

/**
 * 달력
 *
 */
public class Calender {
	public static void main(String[] args) {
//		달력 만들기
//		2000년 1월 1일 - 토요일로 계산
//		730119=729635 + 499 - 19 + 4
		
		
		Scanner sc=new Scanner(System.in);
		
		
		int year=sc.nextInt();
		int month=sc.nextInt();
		int daily=sc.nextInt();
		int day = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
//		System.out.println(day);
//		System.out.println(day%7);//5 - 월
		int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
		if((year%4 ==0 && year%100 !=0) || year%400==0 ){
			mday[1]=29;
		}
		
		for(int i=1; i<month; i++){
			
//			if(i==month){
//				day+=daily;
//				break;
//			}else{
				day+=mday[i-1];
//			}
		}
		
		System.out.println(day);
		System.out.println(day%7);
		System.out.println(year + " " + month);
		System.out.println("  일    월    화   수   목   금   토");
		
		for (int i = -(day%7); i <= mday[month-1]; i++) {
			
			if(i<=0){
				System.out.printf("%3s", "");
			}else if((i+1+day)%7==0){
				System.out.printf("%3d\n", i);
			}else{
				System.out.printf("%3d", i);
			}
			
		}
		switch ((daily+1+day)%7) {
		case 0:
			System.out.println("토");
			break;
		case 1:
			System.out.println("일");
			break;
		case 2:
			System.out.println("월");
			break;
		case 3:
			System.out.println("화");
			break;
		case 4:
			System.out.println("수");
			break;
		case 5:
			System.out.println("목");
			break;
		case 6:
			System.out.println("금");
			break;
		default:
			break;
		}

		
		
		
		
		
	}//end of main
}//end of class

