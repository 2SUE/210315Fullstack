package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
	 		↓ 콘솔에 출력해야 하는 내용 ↓
			
			돈을 주입해 주세요 : 3000
	 	
	 		-------메뉴------
	 		0. 종료
	 		1. 콜라 (1,000원)
	 		2. 사이다 (1,200원)
	 		3. 환타 (1,300원)
	 		-----------------
	 		선택> 1
	 		콜라를 선택하셨습니다. (남은 금액 2,000원)
	 		
	 		선택> 3
	 		콜라를 선택하셨습니다. (남은 금액 700원)
	 		
	 		선택> 1
	 		금액이 부족합니다. (남은 금액 700월)
	 		
	 		콜라를 선택하셨습니다. (남은 금액 2,000원)
	 		
	 		선택> 7
	 		잘못 선택하셨습니다.
	 		
	 		선택> 0
	 		종료 - 남은 금액 : 700원
		 */
		
		System.out.print("돈을 주입해 주세요 : ");
		int insertMoney = scan.nextInt();
		
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };
		System.out.println("\n<메뉴>");
		System.out.println("0. 종료");
		
		for (int i = 0; i < menuNmArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
		}
		
		while(true) {
			System.out.printf("\n선택> ");
			int choice = scan.nextInt();
			
			if(choice == 0) {
				System.out.printf("종료 - 남은 금액 : %,d원\n", insertMoney);
				break;
			} else if (choice < 0 && choice >= menuNmArr.length) {
				System.out.println("잘못 선택하셨습니다.");
				continue;
			} 
			
			int choiceIndex = choice - 1;
			
			if (insertMoney >= menuPriceArr[choiceIndex]) {
				System.out.printf("%s을/를 선택하셨습니다.", menuNmArr[choiceIndex]);
				insertMoney -= menuPriceArr[choiceIndex];
			} else {
				System.out.printf("금액이 부족합니다.");
			}
			System.out.printf(" (남은 금액 %,d원)\n", insertMoney);
		}
		
		scan.close();
	}
}
