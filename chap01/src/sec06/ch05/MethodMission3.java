package sec06.ch05;

public class MethodMission3 {
	public static void main(String[] args) {
		int rNum = getRandomNum(); // 0~9 사이 랜덤값
		System.out.println("rNum : " + rNum);
	}
	
	public static int getRandomNum() {
		return (int)(Math.random()*10);
	}
}
