package sec06.exam01;

public class PrintExample {
	public static void main(String[] args) {
		
		// System,out.println : 자동 개행
		// display : block
		// syso + [ctrl] + [space] : 단축
		System.out.println("하하");
		System.out.println("호호");
		System.out.println("후후");
		System.out.println();

		// display : inline
		System.out.print("하하");
		System.out.print("호호");
		System.out.print("후후");
		System.out.println();
		System.out.println();
		System.out.print("하하\n");
		System.out.print("호호\n");
		System.out.print("후후\n");
		System.out.println();

		// TODO: System,out.printf 나중에 설명
		// printf : 개행 안 됨
		
		char bloodType = 'A';
		int age = 6;
		float weight = 5.4f;
		String name = "이 홍";
		
		// 하드코딩 - 변수를 사용하지 않고, 값 변경이 없음
		System.out.println("제 이름은 이지수이며, 나이는 24살, 혈액형은 A형이고, 몸무게는 30.4kg입니다.");
		
		// 제 이름은 이지수이며, 나이는 24살, 혈액형은 A형이고, 몸무게는 30.4kg입니다.
		System.out.println("제 이름은 " + name + "이며, 나이는 " + age + 
				"살, 혈액형은 " + bloodType + "형이고, 몸무게는 " + weight + "kg입니다.");
		
		System.out.printf("제 이름은 %s이며, 나이는 %d살, 혈액형은 %c형이고, 몸무게는 %.1fkg입니다.\n", 
				name, age, bloodType, weight);
		
		// %s : String / %d : decimal(10진수) int / %c : char / %f : float, double
		// 모든 데이터 타입은 %s로 찍을 수 있다. but 기능이 없음
		
		/*
		 	[ %d 기능 ]
		 	%5d - 5칸 여백차지 (변수 값자리 포함)
		 	%05d - 5칸 여백차지 후 0으로 채우기 (변수 값자리 포함)
		 		   무조건 특정 자리 수 만큼을 써야한다! 할 때 사용 (날짜나 나이 표기)
		 	%-5d - 왼쪽정렬
		 		   
		 	[ %f 기능 }
		 	%.1f - 소수점 한자리 수까지 출력
		 	%10.1f - 10칸 여백차지 (변수 값자리, '.' 포함)
		 	%010.1f - 10칸 여백차지 후 0으로 채우기 (변수 값자리, '.' 포함)
		 		   	  무조건 특정 자리 수 만큼을 써야한다! 할 때 사용 (날짜나 나이 표기)
		*/
		
		char ch = 'c';
		
		System.out.printf("char cc - %d : %c", (int)ch, ch);
	}
}
