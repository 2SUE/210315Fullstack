package sec06.ch04;

public class ForExam3 {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 9, 10, 56 };
		
		// for each문
		// 인덱스 사용 불가
	   // 각 방의 type : 순서가 있고 다수의 값을 가진 시퀀스
		for (int val : arr) { // 시퀀스가 가진 값 만큼 for문 회전
			System.out.println(val);
		}
	}
}