package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	// 남자 평균키 : 175, 여자 평균키 : 163
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		
		do {
			// 남, 여 받기
			System.out.print("성별 : ");
			String gender = scan.next();
			
			System.out.print("키 : ");
			int height = scan.nextInt();
			
			// 성별 : 남, 키 : 170cm, 평균 미만 
			String result = chk(gender, height); // argument
			System.out.printf(result);
			
			System.out.print("계속 하시겠습니까? (y, n) : ");
			answer = scan.next();
		
		} while(answer.equals("y"));
		System.out.println("끝");
		
		scan.close();
	}
	
	public static String chk(String gender, int height) {
//		int stand = 175;
//		String result = "평균";
//		
//		if (gender.equals("여")) {
//			stand = 163;
//		} else if(!gender.equals("여") || !gender.equals("남")) {
//			return "측정 불가\n";
//		}
//		
//		if(height > stand) {
//			result += " 초과";
//		} else if (height < stand) {
//			result += " 미만";
//		}
		
		int stand = 0;
		String result = "평균";
		
		switch(gender) {
		case "여": case "여자":
			stand = 163;
			break;
		case "남": case "남자":
			stand = 175;
			break;
		default:
			return "성별을 잘못 입력하셨습니다.\n";
		}
		
		if(height > stand) {
			result = "평균 초과";
		} else if (height < stand) {
			result = "평균 미만";
		}

//		return "성별 : " + gender + ", 키 : " + height + "cm, " + result + "\n";
		return String.format("성별 : %s, 키 : %d, %s\n", gender, height, result);
	}
}
