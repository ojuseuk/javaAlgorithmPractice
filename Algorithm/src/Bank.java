import java.text.CharacterIterator;
import java.util.Scanner;

/**
 * 은행
 *
 */
public class Bank {
	public static void main(String[] args) {
		Bank_Transaction bank = new Bank_Transaction();

		int choice; // 선택(입금,출금,잔고,종료)
		int money = 0; // 돈(입금, 출금)
		int balance = 0; // 잔고
		String[] bankName = { "입금액", "출금액", "잔고", "종료" };

		x: while (true) {

			System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			choice = bank.scan.nextInt();
			if (choice == 1 || choice == 2) {
				System.out.print(bankName[choice - 1] + "> ");
				money = bank.scan.nextInt();
			}

			switch (choice) {

			case 1:
				if (money < 0) {
					money = bank.negative(bankName, choice, money);
				}
				balance += money;
				break;
			case 2:
				if (money < 0) {
					money = bank.negative(bankName, choice, money);
				}
				if (balance < money) {
					money = bank.negative(bankName, choice, money, balance);
				}
				balance -= money;
				break;
			case 3:
				System.out.println("잔고> " + balance + "원");
				break;
			case 4:
				System.out.println("프로그램 종료");
				break x;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}// end of switch

			if (choice == 1 || choice == 2) {
				System.out.printf("%d원 %s, 잔고:%d원\n", money, bankName[choice - 1], balance);
				System.out.println();
			}

		} // end of while

	}// end of main
}// end of class

class Bank_Transaction {
	Scanner scan = new Scanner(System.in);

	int negative(String[] bankName, int choice, int money) {
		while (true) {
			System.out.println("0보다 큰수를 입력하세요");
			System.out.print(bankName[choice - 1] + "> ");
			money = scan.nextInt();

			if (money > 0)
				break;
		}

		return money;
	}

	int negative(String[] bankName, int choice, int money, int balance) {
		while (true) {
			System.out.println("잔고가 부족합니다. 다시 입력하세요.");
			System.out.print(bankName[choice - 1] + "> ");
			money = scan.nextInt();

			if (balance < money)
				continue;
			else if (balance >= money)
				break;
		}

		return money;
	}

}