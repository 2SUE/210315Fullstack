package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
	 		↓ 콘솔에 출력해야 하는 내용 ↓
	 	
	 		-------메뉴------
	 		0. 종료
	 		1. 콜라 (1,000원)
	 		2. 사이다 (1,200원)
	 		3. 환타 (1,300원)
	 		-----------------
	 		선택> 1
	 		콜라를 선택하셨습니다.
	 		-----------------
	 		선택> 7
	 		잘못 선택하셨습니다.
		 */

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000 };

		while (true) {
			System.out.println("==========메뉴==========");
			System.out.println("0. 종료");
			for (int i = 0; i < menuNmArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
			}
			System.out.println("=======================");
			System.out.print("선택 > ");
			int choice = scan.nextInt();

			if (choice == 0) {
				System.out.println("종료 되었습니다.");
				break;
			} else if (choice >= 1 && choice <= menuNmArr.length) {
				System.out.println(menuNmArr[choice - 1] + "을/를 선택하셨습니다.\n");
			} else {
				System.out.println("잘못 선택하셨습니다.\n");
			}
		}

		scan.close();
	}
}
