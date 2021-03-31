package sec06.ch04;

public class LabelLoopExam {
	public static void main(String[] args) {
		
//		OUTER: , INNER: - 레이블링, break; or continue; 위치를 잡아줌
//		OUTER 말고 걍 다른 이름 줘도 됨
		OUTER: 
		for (int i = 0; i <3; i++) {
			for (int z = 100; z < 105; z++) {
				System.out.printf("%d - %d\n", i, z);
				if(z == 103) {
//					OUTER를 안 쓰면 break;에 가장 가까운 for문만 탈출
					break OUTER;
				}
			}
		}		
		System.out.println("---끝---");
	}
}
