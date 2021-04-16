package sec06.ch04;

public class IfExam3 {
	public static void main(String[] args) {

		if (true) {
			System.out.println("A");
			if (true) {
				System.out.println("B");
			} else if (true) {
				System.out.println("C");
			} else {
				System.out.println("D");
			}
		} else if (true) {
			System.out.println("E");
			if (true) {
				System.out.println("F");
				if (true) {
					System.out.println("G");
					if (true) {
						System.out.println("H");
					}
				}
			}
		}
	}
}
