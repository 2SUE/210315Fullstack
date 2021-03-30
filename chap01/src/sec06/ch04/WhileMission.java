package sec06.ch04;

public class WhileMission {
	public static void main(String[] args) {
		// 1 ~ 100 합계를 구하시오
		// 합계 : 5050
		
		int i = 0;
		int sum = 0;
		while(i++ < 100) {			
			sum += i;			
		}
		System.out.println("합계 : " + sum);
	}
}
