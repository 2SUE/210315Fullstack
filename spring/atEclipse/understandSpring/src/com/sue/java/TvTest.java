package com.sue.java;

public class TvTest {
	public static void main(String[] args) {
		Tv lgtv = new LgTv(new AppleSpeaker(40));
		Tv samsung = new SamsungTv(new SonySpeaker(30));
		
		// 모든 객체에는 equals, toString 둘 다 있음
		// 모든 갹체의 최상위 객체인 Object에 두 메소드가 있다는 뜻
		
		// LgTv, 100인치. 40채널, 50볼륨
		System.out.printf("LG TV, %d인치, %d채널, %d볼륨\n" , lgtv.getInch(), lgtv.getMaxChannel(), lgtv.getMaxVolume()); 
		System.out.println(lgtv.toString());
		
		// SamsungTv, 90인치, 30채널, 40볼륨
		System.out.printf("SAMSUMG TV, %d인치, %d채널, %d볼륨\n" , samsung.getInch(), samsung.getMaxChannel(), samsung.getMaxVolume()); 
		System.out.println(samsung.toString());
		
		// is B (상속)
		// has B (멤버필드 객체화)
	}
}