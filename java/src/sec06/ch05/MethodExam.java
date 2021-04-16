package sec06.ch05;

public class MethodExam {	
			   // 리턴 타입 / 메소드명 / 매개변수 (파라미터)
	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println("result : " + result);
	}
	
	public static int sum(int n1, int n2) /*선언구*/ {
		return n1 + n2; // 구현구
	}
}
