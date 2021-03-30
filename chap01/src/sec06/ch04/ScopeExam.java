package sec06.ch04;

public class ScopeExam {
	public static void main(String[] args) {
		// scope (스코프) 변수, 상수가 살아있는 범위
		
		int a = 10;
		
		if(a > 9) {
			System.out.println("a : " + a);
			
			int j = 10;
			
			System.out.println("jjj (1) : " + j);
		}
		
		// System.out.println("jjj (2) : " + j); scope 문제
		
		// for문은 중복 선언 가능
		for (int i = 0; i < 10; i++) {} // == for (true) {int i = 10;}
		for (int i = 0; i < 10; i++) {} // == for (true) {int i = 10;}
	}
}
