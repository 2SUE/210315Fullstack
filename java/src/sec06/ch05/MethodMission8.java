package sec06.ch05;

public class MethodMission8 {
	public static void main(String[] args) {
		gugudan(8); // 8단 출력
		gugudan(4, 8); // 4~8단 출력 단 바꿀 때 개행 구분자 사용
	}
	
	public static void gugudan(int dan) {
		for(int i = 1; i <= 9; i++ ) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		System.out.println("-----------");
	}
	
	
	public static void gugudan(int dan1, int dan2) {
		for(int i = dan1; i <= dan2; i++ ) {
			gugudan(i);
		}
	}
}
