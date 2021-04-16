package sec06.ch05;

public class MethodMission4_1 {
	public static void main(String[] args) {
		sumAllFromTo(4, 2); // sum : 9
		sumAllFromTo(2, 4); // sum : 9
	}

	public static void sumAllFromTo(int n1, int n2) {
		int sum = 0;
		
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		
		for (int i = n1; i >= n2; i--) {
			sum += i;
		}
		
		System.out.printf("%d ~ %d의 총합 : %d\n", n1, n2, sum);
	}
}
