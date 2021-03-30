package sec06.ch04;

public class ForExam2 {
	public static void main(String[] args) {
		// 중첩 for문
		for (int i = 0; i < 5; i++) {
			for (int z = 0; z < 10; z++) {
				System.out.printf("%d - %d\n", i, z);
			}
		}
	}
}