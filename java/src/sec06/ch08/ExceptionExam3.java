package sec06.ch08;

public class ExceptionExam3 {
	public static void main(String[] args) {
		Calc2 c = new Calc2();
		int result = 0;
		
		try {
			result = c.div(10, 0);
		} catch (Exception e) {
			e.printStackTrace(); // 콘솔에 에러 찍어줌
			System.out.println("예외가 발생된다면 처리하고 싶은 내용들");
		} finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("result : " + result);
	}
}

class Calc2 {
	// 예외가 발생하면,, 예외를 던진다!
	// 이 메소드를 쓰려면 무조건 예외처리 해야함
	// 예외처리를 상황에 따라 다르게 할 수 있음
	int div(int n1, int n2) throws Exception {
		return n1 / n2;
	}
}