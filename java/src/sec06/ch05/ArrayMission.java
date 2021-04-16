package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		// 정수형 배열 생성 (10칸짜리)
		// 모든 방에 정수값 20을 세팅
		int[] intArr = new int[10];

		// 배열 값 넣는 거 따로, 출력하는 거 따로 하라~~
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 20;
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}
}
