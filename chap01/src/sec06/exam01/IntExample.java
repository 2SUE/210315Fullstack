package sec06.exam01;
 
// 정수
public class IntExample {
	public static void main(String[] args) {   
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		
		// 자동형변환
		s = b; 		
		s = (short)i; 
		
		// 작은 타입에서 큰 타입으로 대입할 땐 문제 x
		// 큰 타입에서 작은 타입으로 대입할 땐 상황에 따라 문제 발생
		// 자동형변환이 안 될 경우 강제형변환을 해줘야 함 (캐스팅)
	}
}
