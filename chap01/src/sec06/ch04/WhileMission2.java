package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {

		int sum = 0;
		
		// 0 ~ 10사이 랜덤값이 나오도록
		
		
		// 0 나올 때까지 반복문 돌리기
		// sum : 지금까지 더한 값 출력
		
		int val = (int) (Math.random() * 11);
		while(val != 0) {
			sum += val;
			val = (int) (Math.random() * 11);
			System.out.println("val : " + val);
		}
		
		System.out.println("sum : " + sum);
		
	}
} 
