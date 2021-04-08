package sec06.ch06;

public class OverrideExam {
	public static void main(String[] args) {
		NumBox nb1 = new NumBox(10);
		NumBox nb2 = new NumBox(10);
		
		System.out.println(nb1);
		System.out.println(nb2);
		System.out.println("nb1.equals(nb2) : " + nb1.equals(nb2));
	}
}

class NumBox {
	private int num;
	
	NumBox(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}	
	
	@Override
	public boolean equals(Object obj) {
//		Object는 모든 데이터 타입, 객체를 담을 수 있다.
		NumBox temp = (NumBox) obj;
		
		return this.getNum() == temp.getNum(); // 값비교로 오버라이딩
	}
}