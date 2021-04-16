package sec06.ch04;

// Math.random() 리턴값 - double 형태
// 0 ~ 0.99999
public class SwitchMission {
	public static void main(String[] args) {
						      // 0 ~ 3 -> 8 ~ 11
		int time = (int)(Math.random()*4)+8;
		
		// 8 ~ 11 사이 정수 값이 time 변수에 대입됩니다.
		// time == 8 -> "출근합니다."
		// time == 9 -> "회의를 합니다."
		// time == 10 -> "업무를 봅니다."
		// 나머지 시간 -> "외근을 나갑니다."
		
		System.out.println("time : " + time);
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
		}
	}
}
