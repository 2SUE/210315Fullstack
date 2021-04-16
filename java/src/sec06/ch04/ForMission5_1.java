package sec06.ch04;

public class ForMission5_1 {
	public static void main(String[] args) {
		// 2*1=2 ~ 9*1=9
		// 2*2=4 ~ 9*2=18
		
		for(int i = 1; i <= 9; i++) {
			for(int z = 2; z <= 9; z++) {
				System.out.printf("%d * %d = %d\t", z,i,z*i);
			}
			System.out.println();
		}
	}
}
