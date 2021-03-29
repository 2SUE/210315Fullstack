package sec06.ch04;

public class SwitchMission3 {
	public static void main(String[] args) {
		// Math.random() 메소드를 이용하여
		// 1 ~ 12 범위값만 나오게 처리
		
		int season = (int)(Math.random()*12) +1 ;
		
		System.out.println("season : " + season);
		// season 값이
		// 3 ~ 5 -> "봄"
		// 6 ~ 8 -> "여름"
		// 9 ~ 11 -> "가을"
		// 12 ~ 1, 2 -> "겨울"
		
		switch(season) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
		default :
			System.out.println("겨울");
			break;
		}
	}
}
