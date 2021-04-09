package sec06.ch06;

public class InheriExam {
	public static void main(String[] args) {
		Koshort cat2 = new Koshort();
	}
}

			 // 최상위 객체인 Object를 상속받음
class Animal /* extends Object */ {
	String name;
	int age;
	
//	public Animal(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	void howling() {
		System.out.printf("운다.\n");
	}
}

// 자식은 부모가 가진 요소 모두를 상속받는다.
// 다중 상속 불가, 하나만 상속 가능
class Cat extends Animal {
	
	Cat() {
//		super("", 0); // Animal에 기본 생성자가 없기 때문에 생성된 생성자의 매개변수를 맞춰줘야함
		
//		System.out.println("Cat 생성자");

//		super(); 기본으로 들어감
		// this : 클래스명 자기 자신
		// super() : 바로 위의 부모
	}
	
	void lick() {
		System.out.printf("%s가 핥는다.\n", name);
	}
	
	@Override // 부모 매소드 덮어쓰기
	void howling() {
		System.out.println("야옹");
	}
}

class Koshort extends Cat {
	Koshort() {
		System.out.println("Koshort 생성자");
	}
	
	void pee() {
		System.out.printf("%s가 소변을 본다.\n", name);
	}
}

// 생성자는 자식 클래스에서부터 호출되고, 부모 생성자로 타고 올라감
// 실행이 끝나면 종료되고 하위 요소 실행
// Stack 구조 (FILO)