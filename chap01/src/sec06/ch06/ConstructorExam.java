package sec06.ch06;

public class ConstructorExam {
	
	// 객체지향 언어는 모두 생성자를 사용한다.
	// 생성자는 객체가 만들어질 때 무조건 호출을 해야 한다.
	public static void main(String[] args) {
		
//					기본 생성자 호출
		Tv tv1 = new Tv();
		tv1.brand = "Samsung";
		tv1.inch = 100;
		tv1.maxChannel = 200;
		tv1.maxVolume = 100;
		tv1.displayState(); // Samaung 100inch 100Channel 100Volume
		
//		tv1.volumeUp();
//		tv1.volumeUp();
//		tv1.volumeUp();
//		
//		tv1.displayVolume(); // 현재 볼륨 : 3;
		
		Tv tv2 = new Tv("LG", 120, 300, 200);
		tv2.displayState(); // LG 120inch 300Channel 200Volume
	}
}

class Tv {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	// 생성자 - 메소드의 한 종류
	// 객체 생성 시에만 사용가능하다.
	// 기본 생성자
	// 생성자와 메소드 구분 법
	// 생성자의 이름은 클래스 명이랑 같다.
	// 리턴타입이 없다.
	
	// this = 자기 자신의 주소 값
	Tv(String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch =  inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	// 생성자가 없을 때 컴파일러가 기본 생성자를 자동으로 생성해준다.
	Tv() {} 
	
	
	void volumeUp() {
		currentVolume++;
	}
	
	void displayVolume() {
		System.out.println("현재 볼륨 : " + currentVolume);
	}
	
	void displayState() {
		System.out.printf("%s\t%dinch %dchannel %dvolume\n", brand, inch, maxChannel, maxVolume);
	}
}

//class Car { 같은 패키지 안에 있는 클래스 중복 생성 불가
//	
//}