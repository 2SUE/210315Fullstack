package sec06.ch05;

public class MethodExam2 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 30;
		
		System.out.print("voidSum : ");voidSum(n1, n2);
		System.out.println("intSum : " + intSum(n1, n2));
		
		int result = intSum(n1, n2 );
		System.out.println("intSum - result : " + result);
		
		System.out.println("String method : " + print());
	}
	
	public static void voidSum(int n1, int n2) {
		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);
	}
	
	public static int intSum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static String print() {
		return 1 + 1 + "";
	}
}
