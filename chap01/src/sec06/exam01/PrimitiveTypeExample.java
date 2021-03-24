package sec06.exam01;

// 원시타입 vs 참조타입(Reference type)
public class PrimitiveTypeExample {
	public static void main(String[] arge) {
		// 원시타입 총 8개
		// 원시타입은 첫 글자가 소문자로 시작
		// 원시타입은 리터럴 값을 저장
		// byte, short, int, long   (정수형)
		// float, double			(정수+실수형)
		// char 					(문자형)
		// boolean
		
		// 두 타입이 만났을 때 형변환되는 우선순위
		// 작은 타입이 큰 타입으로 형변환됨 ~.~
		// byte < short < int < long < float < double
		
		byte var1 = 127;
		short var2 = 128;
		
		System.out.println("var1 : " + var1);
		
		var1 = (byte)var2;
		
		System.out.println("var1 : " + var1);
		// 데이터 내부가 원형이다,, 127을 overflow하면 -128로 넘어간다,,, 그렇다,,
		// -128을 underflow하면 127로 넘어간다
		
		float var3 = 10.123f;
		int var4 = (int)var3;
		System.out.println("var4 : " + var4);
		// 실수형을 정수형으로 형변환하면 소수점 아래로 다 사라지 ~.~
	}
}