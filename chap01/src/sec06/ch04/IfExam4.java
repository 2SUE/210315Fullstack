package sec06.ch04;

public class IfExam4 {
	public static void main(String[] args) {
		// 삼항식
		System.out.println(abs(-10));
	}
	
	public static int abs(int val) {	
//		       조건식      true  false
		return val < 0 ? -val : val;
	}
}
