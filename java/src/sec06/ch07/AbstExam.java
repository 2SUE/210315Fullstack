package sec06.ch07;

public class AbstExam {
	public static void main(String[] args) {
		
		// 추상클래스는 객체화 못함
//		Animal animal = new Animal(); 
		
		Animal ani = new Cat();
		ani.breath();
		ani.howling();
	}
}