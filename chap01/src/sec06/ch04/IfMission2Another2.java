package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
		String gender = "여";
		int height = 163;
		
		String displayGender = "여자";
		String displayResult = "평균";
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;
		
		if(gender.equals("남")) {
			stand = WOMAN_STAND;
			displayGender = "남자";
		}
		
		if (height > stand) {
			displayResult = "평균 초과";
		} else if (height > stand) {
			displayResult = "평균 미만";
		}
		
		System.out.printf("%s - %dcm  : %s\n", displayGender, height, displayResult);
	}
	
	/*
	public static void main(String[] args) {
		String gender = "남";
		int height = 161;
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		
		
		int stand = 0;
		
		if(gender.equals("남")) {
			stand = MAN_STAND;
		} else if(gender.equals("여")) {
			stand = WOMAN_STAND;
		} else {
			System.out.println("측정할 수 없습니다.");
		}
		
		if (stand != 0) {
			if (height > stand) {
				System.out.println(gender+"자입니다." + " 평균 이상입니다.");
			} else if (height == stand) {
				System.out.println(gender+"자입니다." + " 평균입니다.");
			} else {
				System.out.println(gender+"자입니다." + " 평균 이하입니다.");
			}
		}

		if (stand != 0) {
			if (height > stand) {
				System.out.printf("%s자입니다. 평균 이상입니다.", gender);
			} else if (height == stand) {
				System.out.printf("%s자입니다. 평균입니다.", gender);
			} else {
				System.out.printf("%s자입니다. 평균 이하입니다.", gender);
			}
		}
	}
	*/
		
	/*
	public static void main(String[] args) {
		String gender = "여자";
		int height = 161;
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		
		int stand = MAN_STAND;
		
		if(gender.equals("남자")) {
			System.out.println(gender+"입니다.");
		} else if(gender.equals("여자")) {
			stand = WOMAN_STAND;
			System.out.println(gender+"입니다.");
		} else {
			System.out.println("측정할 수 없습니다.");
		}
		
		if (height > stand) {
			System.out.println("평균 이상입니다.");
		} else if (height == stand) {
			System.out.println("평균입니다.");
		} else {
			System.out.println("평균 이하입니다.");
		}
	}
	*/
}

