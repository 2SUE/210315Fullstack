package sec06.ch04;

public class WhileMission2_1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		while(true) {
			int val = (int) (Math.random() * 11);
			sum += val;
			if(val == 0) {
				System.out.println("~~~~탈출~~~~");
				break;
			}
			System.out.println("val : " + val);
		}
		
		System.out.println("sum : " + sum);
		
	}
}
