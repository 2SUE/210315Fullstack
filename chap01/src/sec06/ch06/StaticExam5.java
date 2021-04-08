package sec06.ch06;

public class StaticExam5 {
	public static void main(String[] args) {
		// n1 = 10, n2 = 20
		// sum() 호출하여 결과 값 콘솔에 찍기
		StaticExam5 st = new StaticExam5();
		st.n1 = 10;
		st.n2 = 20;
		System.out.println("st.sum() : " + st.sum());
	}
	
	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	}
	
}