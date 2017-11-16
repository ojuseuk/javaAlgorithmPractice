import java.util.Scanner;

/**
 * 자연수
 *
 */
public class Natural {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int natural = scan.nextInt();
		
		int n1 = 0;
		
		while(true){

			if(n1*n1 > natural){
				n1--;
				break;
			}
			
			if(n1*n1 == natural){
				break;
			}
			n1++;
			
		}
		
		System.out.println(natural+ " " +n1);
		
		
		
	} // end of main
} // end of class





