package sec06.ch06;

public class ConstructorExam2 {
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
		tv.displayState();
		// 일렉트로, 50inch 100Channel 50Volume
	}
}

class Tv2 {
	String brand;
	int inch;
	int maxChannel;
	int maxVolume;
	int currentChannel;
	int currentVolume;
	
	Tv2 (String brand, int inch, int maxChannel, int maxVolume) {
		this.brand = brand;
		this.inch =  inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	// 생성자 안에서 다른 생성자 호출 가능
	// this.  => 멤버 필드, 멤버 메소드 호출, 읽기, 쓰기 가능
	// this() => 다른 생성자 호출
	Tv2 () {
		this("일렉트로", 50, 100, 50);
	} 
	
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