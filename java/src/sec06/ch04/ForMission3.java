package sec06.ch04;

public class ForMission3 {
	public static void main(String[] args) {

		// star는 5 ~ 10 사이 랜덤 값
		// 만약 star 값이 5라면 "*****" 출력
		// 만약 star 값이 8라면 "********" 출력

		int star = (int) (Math.random() * 6) + 5;
		System.out.println("star : " + star);

		for (int i = 0; i < star; i++) {
			System.out.print("*");
		}
	}
}