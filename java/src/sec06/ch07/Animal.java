package sec06.ch07;

// 추상 클래스
// 추상 메소드 없어도 추상 클래스 생성 가능 (객체화 하기 싫으면,,)
public abstract class Animal {
	private int age;
	private String name;
	
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

	// 추상메소드
	// 메소드 선언부만 존재 (구현부x)
	public abstract void howling();
	
	public void breath() {
		System.out.println("숨쉰다.");
	}
}

// 추상 클래스를 상속 받으면 오버라이딩을 반드시 해야 함 (강제)
// 추상 메소드 오버라이딩 안 하려면 추상 클래스로 만들어주면 됨	
class Cat extends Animal {

	@Override
	public void howling() {
		System.out.println("애옹");
	}
	
}

class Dog extends Animal {
	
	@Override
	public void howling() {
		System.out.println("멍");
	}
	
}