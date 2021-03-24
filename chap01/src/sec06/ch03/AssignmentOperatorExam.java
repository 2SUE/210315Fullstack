package sec06.ch03;

public class AssignmentOperatorExam {
	public static void main(String[] args) {
		int n1 = 0;
		n1 = n1 + 5; // 읽기 == 사용
		System.out.println("n1 = " + n1);
		
		int n2 = n1 + 10;
		System.out.println("n2 = " + n2);
		System.out.println("n1 = " + n1);
		
		n1 = 2;
		
		System.out.println("--------------");
		
		int n3 = 0;
		n3 += 5;
		System.out.println("n3 = " + n3);
		
		int n4 = 10;
		n4 -= 4;
		System.out.println("n4 = " + n4);
	}
}