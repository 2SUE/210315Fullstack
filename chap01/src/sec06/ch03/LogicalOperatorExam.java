package sec06.ch03;

public class LogicalOperatorExam {
	public static void main(String[] args) {
		// &&(and), ||(or), !(not)
		 
		// true가 나오기 힘듦
		// false가 나올 확률이 많은 조건을 앞에 배치
		// 퍼포먼스가 좋아진다,,, 튜닝,,
		boolean res1 = (1>7) && true && false;
		System.out.println("res1 = " + res1);
		
		res1 = (1<7) && true && true;
		System.out.println("res1 = " + res1);

		// false가 나오기 힘듦
		// true가 나올 확률이 많은 조건을 앞에 배치
		boolean res2 = (10<2) || false || true;
		System.out.println("res2 = " + res2);
		
		res2 = (10>2) || false || false;
		System.out.println("res2 = " + res2);
	}
}
