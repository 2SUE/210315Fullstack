package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Animal hamster = new Hamster();
		
		// instanceof : 형변환이 가능한지 알아봐주는 키워드
		
		System.out.println(hamster instanceof Hamster); // true
//		System.out.println(pig instanceof Hamster); // false
		
		// 새롭게 햄스터 객체 만들지 않고
		// 7번 라인의 hamster 변수에 저장된 주소값을 활용하여
		// runRail() 호출
		
//		((Hamster)hamster).runRail();
		Hamster ham = (Hamster) hamster;
		ham.runRail();
		
		// 해당 클래스 내에서 호출된 메소드~!
		cry(cat); // 해당 클래스를 벗어나면 PolymorMission.cry(cat); 로 적어줘야 함
		cry(pig);
		cry(hamster);
	}
	
	// 타입 : 호출 할 수 있냐 없
	 // ani로 Hamster 객체 주소값이 들어오면 howling() 말고 runRail()호출
	static void cry(Animal ani) {
		if(ani instanceof Hamster) {
			((Hamster) ani).runRail();
		} else {
			ani.howling();
		}
		
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
	
	public void runRail() {
		System.out.println("쳇바퀴를 굴린다.");
	}
}