package sec06.ch04;

public class WhileExam3 {
	public static void main(String[] args) {
		
		int val = 0;
		int sum = 0;
		
		// 일단 한 번 실행하고 봄
		do {
			val = (int)(Math.random() * 11);
			sum += val;
		} while (val != 0);
		
		System.out.println("do~while sum : " + sum);
	}
}
