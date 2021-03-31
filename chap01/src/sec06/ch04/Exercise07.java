package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 0;

		while (true) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			
			System.out.print("선택> ");
			int inputVal = scan.nextInt();

			if (inputVal == 1) {
				System.out.print("예금액> ");
				balance += scan.nextInt();
				continue;
			} else if (inputVal == 2) {
				System.out.print("출금액> ");
				balance -= scan.nextInt();
				continue;
			} else if (inputVal == 3) {
				System.out.println("잔액> " + balance);
				continue;
			} else if (inputVal == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");

		

//			MAIN:
//			while (run) {
//			System.out.println("---------------------------------");
//			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//			System.out.println("---------------------------------");
//			
//			System.out.print("선택> ");
//			int inputVal = scan.nextInt();
//			
//			switch(inputVal) {
//			case 1:
//				System.out.print("예금액> ");
//				balance += scan.nextInt();
//				break;
//			case 2:
//				System.out.print("출금액> ");
//				balance -= scan.nextInt();
//				break;
//			case 3:
//				System.out.println("잔액> " + balance);
//				break;
//			case 4:
//				break MAIN;
//			}
//		}
//		System.out.println("프로그램 종료");
		
		scan.close();
	}
}