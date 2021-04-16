package sec06.ch05;

public class ArrayExam {
	public static void main(String[] args) {
		// 배열 (같은 타입의 변수를 여러개 사용하기 위해 사용)

		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

		int[] intArr = new int[10]; // 10개의 값을 저장할 수 있는 공간 생성
//		intArr[0] = 11;
//		intArr[1] = 12;
//		intArr[9] = 13;
//		intArr[3] = intArr[9] + 4;

		// 변수 크게 분류 - 원시형(primitive), 참조형(reference)
		// 원시형 : byte, short, int, long, boolean, char, float, double
		// 참조형 : 첫글자가 대문자로 시작
		// 원시형 - 기본값 : 0
		// 참조형 - 기본값 : null
		String[] strArr = new String[10];

		// 원시형 - 기본값 : 0
		// 참조형 - 기본값 : null
		// 배열은 무조건 참조형이지만 데이터타입에 따라 원시/참조 구분됨
		System.out.println("strArr[1] : " + strArr[1]);
		System.out.println("intArr[1] : " + intArr[1]);

		// 데이터타입[] 변수명 = new 데이터타입[갯수(무조건지정)];

		// 배열 변수 선언 방법 1
		int[] intArray1 = new int[3];
		intArray1[0] = 1;

		// 배열 변수 선언 방법 2
		int[] intArray2 = { 10, 20, 30 };

		System.out.println("-----------------");
		for (int i = 0; i < 3; i++) {
			System.out.printf("intArray2[%d] : %d\n", i, intArray2[i]);
		}
		
		// 참조형엔 객체의 주소가 들어있다.
	}
}
