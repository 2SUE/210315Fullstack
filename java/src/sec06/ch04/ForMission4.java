package sec06.ch04;

public class ForMission4 {
	public static void main(String[] args) {
		// 2 ~ 9 사이의 랜덤값 추출
		int dan = (int) (Math.random() * 8 + 2);
		
		/*
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		*/
		
		for (int i = 6; i <= 14; i++) {
			int j = i - 5;
			System.out.printf("%d * %d = %d\n", dan, j, (dan * j));
		}
	}
}