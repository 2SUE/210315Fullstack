package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		// 해당 클래스 내에서 호출된 메소드~!
		cry(cat); // 해당 클래스를 벗어나면 PolymorMission.cry(cat); 로 적어줘야 함
		cry(pig);
		cry(hamster);
	}
	
	// 타입 : 호출 할 수 있냐 없
	static void cry(Animal a) {
		a.howling();
	} // static을 안 붙이려면 객체화 해야 함,,,
	
	/* 
	다형성이 없었더라면 overloading 존나 해야 함
	
	static void cry(Cat c) {
		c.howling();
	}
	
	static void cry(Pig p) {
		p.howling();
	}
	
	static void cry(Hamster h) {
		h.howling();
	}
	*/
}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}