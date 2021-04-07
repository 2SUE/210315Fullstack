package sec06.ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();

		h1.setAge(12);
		h1.setName("홍길동");

		h2.setAge(20);
		h2.setName("심사임당");

		h1.whoAmI(); // 내 이름은 홍길동 나이는 12살입니다.
		h2.whoAmI(); // 내 이름은 신사임당 나이는 20살입니다.

		System.out.printf("My name is %s, age is %d\n", h1.getName(), h1.getAge());
		System.out.printf("My name is %s, age is %d\n", h2.getName(), h2.getAge());
	}
}

class Human {
	// 멤버 필드는 private로 만들어라 ~.~
	private int age;
	private String name;

	// 생성자, 메소드로 외부에서 private 멤버 변수 접근 가능 (값 넣기)
	// 값 빼는 건 getter메소드로만 가능

	// setter, getter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n", name, age);
	}
	
	Human() {
		this("미상"); // this(10); 기본값 하나 주는 거라서 파라미터 둘 중 하나 적어줘도 됨
	}
	
	Human(String name) {
		this(name, 10);
	}
	
	Human(int age) {
		this("미상", 10);
	}
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
}