package sec06.ch04;

public class Exercise05 {
	public static void main(String[] args) {
		/*
			중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 
			(x, y) 형태로 출력해보새요.
			단 x와 y는 10 이하의 자연수 입니다. 
		
			실행결과
			(5, 8)
			(10, 4)
		 */

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if ((4 * i) + (5 * j) == 60) {
					System.out.printf("(%d, %d)\n", i, j);
					break; // 안써도 되지만 퍼포먼스,,,?가 좋음
				}
			}
		}
		System.out.println("--끝--");
	}
}