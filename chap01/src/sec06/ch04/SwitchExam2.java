package sec06.ch04;

public class SwitchExam2 {
	public static void main(String[] args) {
		// 문자열 비교할 때 편함 (eqauls 안 써도 됨 ㅎ-ㅎ)
		// 범위 지정해서 비교할 때 if문이 편함
		String habbit = "수영";
		
		switch(habbit) {
		case "수영": 
		case "등산" :
			System.out.println("건강한 취미입니다.");
			break;
		case "술" :
		case "담배" :
			System.out.println("불건전한 취미입니다.");
		default:
			System.out.println("뭡니까?");
		}
	}
}
