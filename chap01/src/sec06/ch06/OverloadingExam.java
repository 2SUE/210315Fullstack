package sec06.ch06;

public class OverloadingExam {
	public static void main(String[] args) {
		// 오버로딩 : 똑같은 이름의 메소드를 여러 개 생성
		// 규칙
		
		// Calc 객체화
		// sum 메소드 호출 - argument : 5, 10
		
		Calc c = new Calc();
		c.sum(5, 10);
		c.sum(5, 10, 11);
		c.sum(5, 10, "30");
	}
}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}
	
	int sum(int n1, int n2, String n3) {
		System.out.println(n1 + n2 + n3);
		return 0;
	}
}