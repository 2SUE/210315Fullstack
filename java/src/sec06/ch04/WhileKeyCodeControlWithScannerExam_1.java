package sec06.ch04;

//control + shift + o : import
import java.util.Scanner;

public class WhileKeyCodeControlWithScannerExam_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speed = 0;

		System.out.println("-----------------------");
		System.out.println("1. 증속 | 2. 감속 | 3. 종료");
		System.out.println("-----------------------");
		
		while(true) {
			System.out.print("선택 : ");
			int inputVal = scan.nextInt();
			if(inputVal == 1) {
				speed++;
			} else if (inputVal == 2) {
				if(speed == 0) {
					System.out.println("속도가 0입니다. 증속하세요.");
					continue;
				} else {
					speed--;
				}
			} else if (inputVal == 3) {
				System.out.println("");
				break;
			} else {
				System.out.println("1, 2, 3번만 입력하실 수 있습니다.");
				continue;
			}
			System.out.println("speed : " + speed);
		}
	}
}
