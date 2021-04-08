package sec06.ch06;

public class StaticExam2 {
	public static void main(String[] args) {
//		Toy2 t1 = new Toy2();
//		Toy2 t2 = new Toy2();
//
//		System.out.println("장난감 생산 갯수 : " + t1.makeCount); 	// X
//		System.out.println("장난감 생산 갯수 : " + t2.makeCount); 	// X
//		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount); // O
//		
//		System.out.println("Toy3.makeCount : " + Toy3.makeCount);
		
		Toy2.makeCount = 10;
		Toy2 t1 = new Toy2();
		
		System.out.println("Toy2.makeCount : " + Toy2.makeCount);
		System.out.println("Toy3.makeCount : " + Toy3.makeCount);
	}
}

class Toy2 {
	static int makeCount;
	
	Toy2() {
		makeCount++;
	}
}

class Toy3 {
	static int makeCount = 0;
}