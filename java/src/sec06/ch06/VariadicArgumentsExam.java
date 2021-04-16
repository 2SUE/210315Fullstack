package sec06.ch06;

public class VariadicArgumentsExam {
	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		
		int result = cal.sum(10, 20); // new int[] {10, 20} 형태로 넘어감, 괄호 안에 이렇게 적어줘도 됨
		System.out.println("result : " + result);
		
		result = cal.sum(10, 20, 30);
		System.out.println("result : " + result);
		
		result = cal.sum(10, 20, 30, 40);
		System.out.println("result : " + result);
	}
}

class Calc2 {
	int sum(int... vals) { 
		// int... 가변인자
		// 개수 상관 없이 ,,
		// 아규먼트가 int[] 형태로 넘어옴
		
		int sum = 0;
		for(int i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
}