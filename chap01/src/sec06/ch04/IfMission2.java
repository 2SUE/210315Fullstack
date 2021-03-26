package sec06.ch04;

// 남자 평균키 175 
// 여자 평균키 163
public class IfMission2 {
	public static void main(String[] args) {
		String gender = "여"; // 여;
		int height = 163;
		
		// 남 170 < 평균 미만
		// 남 175 == 평균
		// 남 176 > 평균초과
		
		// 여 162 < 평균 미만
		// 여 163 == 평균
		// 여 164 > 평균초과
		
		// String 비교는 equals
		
		if(gender.equals("남")) {
			if (height > 175) {
				System.out.println("평균 이상입니다.");
			} else if(height == 175) {
				System.out.println("평균 입니다.");
			} else {
				System.out.println("평균 미만입니다.");
			}
			
		} else if (gender.equals("여")) {
			if (height > 163) {
				System.out.println("평균 이상입니다.");
			} else if(height == 163) {
				System.out.println("평균 입니다.");
			} else {
				System.out.println("평균 미만입니다.");
			}
		} else {
			System.out.println("측정할 수 없습니다.");
		}
	}
}