package com.sue.java;

// abstract : 추상 클래스 만드는 키워드
// 객체화 방지하기 위해 썼다!
public abstract class Tv /* extends Object가 디폴트 */ {
	private Speaker speaker;
	private String brand;
	private int inch;
	private int maxChannel;
	private int maxVolume;
	private int currentChannel;
	private int currentVolume;
	
	// super : 부모
	// this  : 자신
	// super() : 부모의 기본 생성자 호출
	// this. : 멤버 필드 값 쓰고 빼기, 메소드 호출

	// 리턴 타입 x, 클래스명과 이름이 같음
	// 오버로딩 가능, 생성자가 하나도 없을 때 컴파일러가 자동으로 생성해쥼
	public Tv(Speaker speaker, String brand, int inch, int maxChannel, int maxVolume) {
		this.speaker = speaker;
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d인치, %d채널, %d볼륨", brand, inch, maxChannel, maxVolume);
	}
	
	public void channelUp() {
		if(currentChannel == maxChannel) {
			currentChannel = 1;
		} else {
			currentChannel++;
		}
		
		//currentChannel = currentChannel == maxChannel ? 1 : currentChannel + 1;
		System.out.println("currentChannel : " + currentChannel);
	}
	
	public void channelDown() {
		if(currentChannel == 0) {
			currentChannel = maxChannel;
		} else {
			currentChannel--;
		}
		System.out.println("currentChannel : " + currentChannel);
	}
	
	public void volumeUp() {
		if(currentVolume < maxVolume) {
			currentVolume++;
			speaker.volumeUp();
		}
	}
	
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
			speaker.volumeDown();
		}		
	}

	// private 멤버 필드에 값 넣는 법 : setter method, 생성자
	// private 멤버 필드에 값 빼내는 법 : getter method
	public int getCurrentChannel() {
		return currentChannel;
	}

	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public int getInch() {
		return inch;
	}

	public int getMaxChannel() {
		return maxChannel;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public String getBrand() {
		return brand;
	}
}