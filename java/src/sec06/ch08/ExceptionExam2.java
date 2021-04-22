package sec06.ch08;

public class ExceptionExam2 {
	public static void main(String[] args) {
		// Calc 객체화, div() 10, 2 아규먼트로 호출
		// 리턴값 받고 콘솔에 출력
		Calc c = new Calc();
		int result = c.div(10, 10);
		System.out.println(result);

		System.out.println("-----------");

		System.out.println(c.div(10, 0));
	}
}

class Calc {
	int div(int n1, int n2) {
		try {
			return n1 / n2;
//			return result - 여기에만 return을 적으면 반환되는 값이 없어서 오류남
		} catch (Exception e) {
			System.out.println("예외 발생");
		} finally { // 예외가 발생하지 않아도 실행
			System.out.println("무조건 실행");
		}
		System.out.println("try 밖 실행"); // 예외가 발생하지 않으면 실행 안 됨
		return 0;
	}
}