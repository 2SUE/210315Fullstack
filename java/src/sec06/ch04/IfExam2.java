package sec06.ch04;

public class IfExam2 {
	public static void main(String[] args) {
		int score = 70;
		
		if(score >= 90) { // 90~
			System.out.println("등급 A");
		} else if(score >= 80) { // 80 ~ 89
			System.out.println("등급 B");
		} else if (score >= 70) { // 70 ~ 79
			System.out.println("등급 C");
		} else { // ~ 69
			System.out.println("등급 D");
		}
		
		System.out.println("끝");
	}
}
