package sec06.ch04;

public class WhileExam3_1 {
	public static void main(String[] args) {
		
		int val = 0;
		int sum = 0;
		
		// val 값이 0이라서 실행 안 됨
		while (val != 0) {
			val = (int)(Math.random() * 11);
			sum += val;
		} 
		
		System.out.println("while sum : " + sum);
	}
}
