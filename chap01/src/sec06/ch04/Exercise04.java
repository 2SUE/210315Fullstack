package sec06.ch04;

public class Exercise04 {
	public static void main(String[] args) {
		/*
			while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을
			(눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
			눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
			눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2) 입니다.
			
			눈 값의 범위는 1 ~ 6
			
			실행 결과
			(6, 4)
			(3, 4)
			(5, 4)
			(1, 4)
			끝!
		*/
		
//		int sum = 0;
//		
//		while (true) {
//			int n1 = (int) (Math.random()* 6) + 1;
//			int n2 = (int) (Math.random()* 6) + 1;
//			sum = n1 + n2;
//			
//			if(sum == 5) {
//				System.out.printf("(%d, %d)\n", n1, n2);
//				break;
//			} else {
//				System.out.printf("(%d, %d)\n", n1, n2);
//			}
//		}
		
		while(true) {
			int val1 = (int) (Math.random()* 6) + 1;
			int val2 = (int) (Math.random()* 6) + 1;
			
			System.out.printf("(%d, %d)\n", val1, val2);
			
			if(val1 + val2 == 5) {
				break;
			}
		}
		System.out.println("--끝--");
	}
} 