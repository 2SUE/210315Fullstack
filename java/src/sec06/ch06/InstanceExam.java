package sec06.ch06;

public class InstanceExam {
	public static void main(String[] args) {
		// Dog 객체 생성
//		new Dog(); 생성하자마자 사라짐,,,
//	    타입 변수명  객체화 시켜주는 키워드
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "고구마";
		d2.name = "감자";
		
		d1.bark();
		d2.bark();		
	}
}

// 멤버 필드 = 속성 : 값을 저장할 수 있는 것 - 명사 담당 
// 멤버 메소드 : 값을 수정할 수 있는 것 - 동사 담당
// 설계도
class Dog {
	// 멤버 필드, 전역 변수 (메소드에 소속되어 있지 않음)
	String name;
	String jong;
	int age;
	
	// 멤버 메소드
	void bark() {
		System.out.printf("%s가 멍멍\n", name);
	}
}