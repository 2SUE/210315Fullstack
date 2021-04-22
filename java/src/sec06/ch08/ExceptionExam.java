package sec06.ch08;

public class ExceptionExam {
	public static void main(String[] args) {
		// try ~ catch : 1set
		// finally : option

		System.out.println("에러가 발생하는 코드");
		
		try { // 예외가 발생될 가능성이 높은 소스를 위치
			System.out.println("예외처리를 해보자!");
			int result = 10 / 0; // 예외가 발생하면 catch로 넘어감
			System.out.println("result : " + result);

				// 에러에 관련된 정보가 넘어옴
		} catch (Exception e) { // try문에서 에러가 발생하면 catch로 넘어옴
			e.printStackTrace(); // 오류 알랴쥼
			System.out.println("예외 발생!!!!");
			System.out.println("예외 발생!!!!");
			System.out.println("예외 발생!!!!");

		} finally { // 에러가 터지든 안 터지든 무조건 실행
			System.out.println("무조건 실행!!!!");
		}

		System.out.println("~끝~");
		
		System.out.println("\n에러가 발생하지 않는 코드");
		
		try {
			System.out.println("예외처리를 해보자!");
			int result = 10 / 20; 
			System.out.println("result : " + result);

		} catch (Exception e) { 
			System.out.println("예외 발생!!!!");
			System.out.println("예외 발생!!!!");
			System.out.println("예외 발생!!!!");

		} finally {
			System.out.println("무조건 실행!!!!");
		}

		System.out.println("~끝~");
	}
}
