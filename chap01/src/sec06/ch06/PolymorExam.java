package sec06.ch06;
/*
	다형성 - 메소드 기준
	1. 부모 타입의 변수는 자식 객체를 가리킬 수 있다. (주소값을 담을 수 있다.)
	2. 자식 타입의 변수는 부모 객체를 가리킬 수 없다.
   	   - 자신의 타입 변수는 자신의 객체를 가리킬 수 있다. ex) Cat cat = new Cat();

	3. 타입은 아는 메소드만 호출할 수 있다.
       - 호출이 되었다면 기준은 객체이다.
*/
public class PolymorExam {
	public static void main(String[] args) {
		// 1. 부모 타입의 변수는 자식 객체를 가리킬 수 있다.
		Animal ani_1 = new Cat(); // Cat 객체의 주소 값이 담긴다.

		// 2. 자식 타입의 변수는 부모 객체를 가리킬 수 없다.
//		Cat cat1 = new Animal();

		Cat cat = (Cat) ani_1; // Cat 객체의 주소값이 담긴 변수를 cat 타입 객체에 대입할 때 형변환을 해줘야 함

		// cat으로 형변환할 수 없다고 에러 뜸
//		Cat cat1 = (Cat) new Animal("", 0);

		Animal ani_2 = cat;

		// 3. 타입은 아는 메소드만 호출할 수 있다.
		// Animal 타입이지만 객체는 Cat이기 때문에 Cat에서 오버라이딩 한 howling()이 호출됨
		ani_1.howling();

//		ani_1.lick(); cat 객체지만 Animal 타입이라서 lick() 호출 불가 ->  자식 타입의 변수는 부모 객체를 가리킬 수 없다.
	}
}