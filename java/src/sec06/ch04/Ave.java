package sec06.ch04;

public class Ave {
	public static void main(String[] args) {
		String gender = "여";
		int height = 158;
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		
		int stand = WOMAN_STAND;
		
		if (gender.equals("여")) {
			
		} else if (gender.equals("남")) {
			stand = MAN_STAND;
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
}