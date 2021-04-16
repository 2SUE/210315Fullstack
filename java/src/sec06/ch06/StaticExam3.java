package sec06.ch06;

public class StaticExam3 {
	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance();
		System.out.println("CalcInstance\t: " + ci.sum(10, 20));
		
		System.out.println("CalcStatic\t: " + CalcStatic.sum(15, 25));
		
		StaticExam4.main(args); // 다른 클래스의 호출 가능
	}
}

//메소드 선언(?) 시 static 붙여라~	
class CalcStatic {
	static int sum(int n1, int n2) { // 객체화할 필요 없이 클래스명.메소드명으로 접근, 사용 가능
		return n1 + n2;
	}
}

class CalcInstance {
	int sum(int n1, int n2) {
		return n1 + n2;
	}
}