package sec06.ch06;

public class StaticExam4 {

	// static이 없는 class는 객체화가 필요하기 때문에 static을 붙여줌
	public static void main(String[] args) {

		// CalcInstance2 객체화
		// n1 = 10, n2 = 20
		// n1 + n2 값을 콘솔에 출력
		CalcInstance2 ci = new CalcInstance2();
		ci.n1 = 10;
		ci.n2 = 20;
		System.out.println(ci.sum());

		System.out.println(CalcStatic2.sum(10, 20));

		String.format("%d", ci.sum()); // static method
	}
}

class CalcStatic2 {
	 // static이 안 붙은 변수 : 인스턴스 멤버 필드
	// static이 안 붙은 변수 : 클래스 멤버 필드
	static int n1; // 인스턴스 전역 변수
	int n2;

//				   지역변수
	static int sum(int n1, int n2) { // 멤버 필드 사용 불가
//		       전역 변수 사용 시 클래스명.변수명 (this 안 씀)
		return CalcStatic2.n1 + n2;
	}

//	프로그램 실행 시 바로 메모리에 올라가지만 위 변수들을
//	객체 생성 후에 메모리에 올라가기 때문에 오류 발생
//	static 멤버 메소드는 static 멤버 필드만 사용할 수 있다.

//	static int sum() { 
//		return n1 + n2;
//	}
}

class CalcInstance2 {
	
	int n1;
	int n2;

	int sum() { // 멤버 필드 사용 시 static 붙이지 말어라
		return n1 + n2;
	}
	
	static int sum(int n1, int n2) { // 멤버 필드 사용하지 않을 시 static 사용
		return n1 + n2;
	}
}