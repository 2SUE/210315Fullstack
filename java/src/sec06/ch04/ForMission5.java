package sec06.ch04;

public class ForMission5 {
	public static void main(String[] args) {
		// 2 ~ 9단 구구단 출력
		
		for(int i = 2; i <= 9; i++) {
			System.out.printf("====%d단====\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}
