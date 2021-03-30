package sec06.ch04;

public class ForMission7 {
	public static void main(String[] args) {
		// 3 ~ 7 랜덤값
		int star = (int) (Math.random() * 5 + 3);

		// star = 3
		// *
		// **
		// ***

		System.out.println("star : " + star);

		for (int i = 1; i <= star; i++) {
			for (int z = star; z >= i; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = star; i > 0; i--) {
			for (int z = i; z > 0; z--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < star; i++) {
			for (int z = i; z < star; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}