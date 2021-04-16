package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoIsBig(30, 100); // 콘솔 : 100이/가 가장 큽니다.
		whoIsBig(10, 3); // 콘솔 : 10이/가 가장 큽니다.
		whoIsBig(25, 1); // 콘솔 : 25이/가 가장 큽니다.
		
		int big = getBigNum(10, 30); // 콘솔 : 30이/가 가장 큽니다.
		System.out.println("big : " + big);
		big = getBigNum(10, 9); // 콘솔 : 10이/가 가장 큽니다.
		System.out.println("big : " + big);
	}

	public static void whoIsBig(int n1, int n2) {
		int bigNum = n2;
		
		if(n1 > n2) {
			bigNum = n1;
		} 
		
		System.out.println(bigNum + " 이/가 가장 큽니다.");
	}
	
	public static int getBigNum(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}
		return n2;
	}
}
