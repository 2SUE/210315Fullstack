package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random()*20)+81;
		System.out.println("SCORE : " + SCORE);
		// SCORE 값은 81 ~ 100점 사이의 값이 된다. (실행할 때마다 달라짐)
		
		// 91 ~ 100 A (97점 이상 "A+", 96 ~ 94 "A", 93 ~ 91 "A-")
		// 81 ~ 90 B (87점 이상 "B+", 86 ~ 84 "B", 83 ~ 81 "B-")
		
		String dGrade = "D";
		char dGradeChar = ' ';
		
		int restVal = SCORE % 10;
		if(restVal >= 7 || restVal == 0) { 
			dGradeChar = '+';
		} else if (restVal <= 3) {
			dGradeChar = '-';
		}
		
		if(SCORE > 90) {
			dGrade = "A";
		} else if(SCORE > 80) {
			dGrade = "B";
		} else if(SCORE > 70) {
			dGrade = "C";
		} else {
			dGradeChar = ' ';
		}
		
		System.out.printf("%s%c", dGrade, dGradeChar);
		
		if (SCORE >= 91) {
			if (SCORE >= 97) {
				System.out.println("A+");
			} else if (SCORE >= 94) {
				System.out.println("A");
			} else {
				System.out.println("A-");
			}
		} else if (SCORE >= 81) {
			if(SCORE >= 87) {
				System.out.println("B+");
			} else if (SCORE >= 84) {
				System.out.println("B");
			} else {
				System.out.println("B-");
			}
		}
	}
}
