package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스" };
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000 };
		
		Drink[] drinkArr = new Drink[menuNmArr.length];
		for(int i = 0; i < drinkArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];
			
			drinkArr[i] = drink;
		}
		
		System.out.println("<메뉴>\n0. 종료");
		for(int i = 0; i < drinkArr.length; i++) {
			Drink drink = drinkArr[i]; // 출력하기 편하게 주소 값을 넣어줄 수 있는 Drink객체를 생성해쥼
			System.out.printf("%d. %s (%,d원)\n", i + 1, drink.nm, drink.price);
//			System.out.printf("%d. %s (%,d원)\n", i + 1, drinkArr[i].nm, drinkArr[i].price); 얘로 써도 됨		
		}
		
		System.out.println("--------------------");
		
		printMenu3(drinkArr);
		
	}
	
	public static void printMenu3(Drink[] dArr) {
		String str = "<메뉴>\n0. 종료\n";
		for(int i = 0; i < dArr.length; i++) {
			Drink d = dArr[i];
			str += String.format("%d. %s (%,d원)\n", i+1, d.nm, d.price);
		}
		System.out.println(str);
	}
}
