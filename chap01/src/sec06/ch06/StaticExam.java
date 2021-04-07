package sec06.ch06;

public class StaticExam {
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name);
		
		t2.name = "롯데";
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		
		Toy.name = "SOC"; // 바람직한 static 멤버 필드 사용법
		System.out.println("Toy.name : " + Toy.name);
	}
}

class Toy {
	// static이 붙은 멤버필드는 객체와 상관 없이 하나
	// 할당되는 메모리가 다름
	// 프로그램 실행 시 메모리에 등록
	// 한 값만 저장 가능
	// 공용으로 사용하는 멤버 필드
	// 접근 경로가 다양
	// 클래스명.변수명 으로 사용하는 게 바람직
	static String name;
}