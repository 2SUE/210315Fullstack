package sec06.ch04;

// 남자 평균키 175 
// 여자 평균키 163
public class IfMission2Another {
	public static void main(String[] args) {
		String gender = "남";
		int height = 165;
		
		// 상수 한 번 초기화되면 값을 변경할 수 없다.
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;

		int stand = MAN_STAND;
		
		if(gender.equals("남")) {			
		} else if (gender.equals("여")) {
			stand = WOMAN_STAND;
		} else {
			System.out.println("측정할 수 없습니다.");
		}
		
		if(height < stand) {
			System.out.println("평균 미만");
		} else if(height == stand) {
			System.out.println("평균");
		} else {
			System.out.println("평균 초과");
		}
	}
}