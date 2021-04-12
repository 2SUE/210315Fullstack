package sec06.ch06;

public class PolymorExam2 {
	/*
		1. 부모 타입은 자식 객체 주소 값을 참조할 수 있다. (가리킬 수 있다.)
		2. 자식 타입은 부모 객체 주소 값을 참조할 수 없다. (가리킬 수 없다.)
		3. 변수타입은 메소드 호출 여부만 결정한다 (자기가 아는 것만 호출 가능)
	       - 호출이 되었다면 실행되는 것은 객체 기준 
	*/
	public static void main(String[] args) {
		
		// 1.
		Animal ani1 = new Hamster();
		Animal ani2 = new Animal();
		
		// 2.
//		Hamster ani3 = new Animal(); 
//		Animal ani4 = new String(); 쌩판 남도 참조 안 됨
		Hamster ham = (Hamster) ani1;
//		Hamster ham2 = (Hamster) ani2; 에러 발생
	}
}