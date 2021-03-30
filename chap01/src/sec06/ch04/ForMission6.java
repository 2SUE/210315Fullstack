package sec06.ch04;

public class ForMission6 {
	public static void main(String[] args) {
		// 3 ~ 7 랜덤값
		int star = (int)(Math.random() * 6 + 3);
		System.out.println("star : " + star);
		
		// star = 3 (3칸짜리 별이 3줄)
		// ***
		// ***
		// ***
		
		// star = 5 (3칸짜리 별이 3줄)
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for(int i = 0; i < star; i++) {
			for(int z = 0; z < star; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
