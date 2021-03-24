package sec06.ch03;

public class OperatorExam {
	public static void main(String[] args) {
		// 산술연산자
		
		int n1 = 10;
		int n2 = 3;
		
		System.out.println(n1 + n2); // 정수 + 정수 = 정수
		System.out.println(n1 - n2);
		System.out.println(n1 / n2);
		System.out.println((float)n1 / (float)n2);
		System.out.println((float)n1 / n2); // 큰 타입으로 자동 형변환
		System.out.println((float)(n1 / n2)); // int끼리 계산 후 형변환,,,, 소수점 날아갑니당
		System.out.println(n1 * n2);
		
		System.out.println("-------------");
		
		int result = 3 + 4 + 5 * 6;
		System.out.println(result);
		
		int mod = 10 % 3;
		System.out.println(mod);
		
		int odd = 3 % 2;
		int even = 4 % 2;
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
		
		System.out.println("-------------");
		
		int n3 = -1;
		System.out.println("n3 : " + (-n3));
	}
}
