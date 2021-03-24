package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 < num2);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);

		System.out.println("---------------");
		
		char ch1 = 'a'; // ASCII CODE : 97
		char ch2 = 'A'; // ASCII CODE : 65
		boolean result5 = ch1 < ch2;
		System.out.println("result5 = " + result5);
		System.out.println('a' == 97);
		
		// float, double은 비교x
		// 굳이 할거면 double을 float으로 형변환 해야 함
		
		// <, >, <=, >=, ==, != : 원시형 숫자 타입 (include char)
		// reference type에서 ==은 주소값 비교
		// String은 값 비교 시 value1.equals(value2)를 이용
		
		String str1 = "A"; // String str1 = new String('A');
		String str2 = "A";
		
		System.out.println("str1 == str2 = " + (str1 == str2));
		System.out.println("str1.equals(str2) = " + str1.equals(str2));
	}
}
