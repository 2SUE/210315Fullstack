package com.sue.spring;

import com.sue.java.LgTv;
import com.sue.java.SamsungTv;
import com.sue.java.Speaker;
import com.sue.java.Tv;

// IOC : 소스 수정 없이 코드 짠다ㅏ,,
// 외부의 값을 받아서 결정,,,
// 기존 개발의 반대 방향
public class SpringTvTest {
	public static void main(String[] args) {
		// Run config,, arguments 
		// apple sony 입력 (구분은 스페이스)
		Speaker s1 = SpeakerFactory.choiceSpeaker(args[0]);
		Speaker s2 = SpeakerFactory.choiceSpeaker(args[1]);
		
		Tv lgtv = new LgTv(s1);
		Tv samsung = new SamsungTv(s2);
		
		// 모든 객체에는 equals, toString 둘 다 있음
		// 모든 갹체의 최상위 객체인 Object에 두 메소드가 있다는 뜻
		
		// LgTv, 100인치. 40채널, 50볼륨
		System.out.printf("LG TV, %d인치, %d채널, %d볼륨\n" , lgtv.getInch(), lgtv.getMaxChannel(), lgtv.getMaxVolume()); 
		System.out.println(lgtv.toString());
		
		// SamsungTv, 90인치, 30채널, 40볼륨
		System.out.printf("SAMSUMG TV, %d인치, %d채널, %d볼륨\n" , samsung.getInch(), samsung.getMaxChannel(), samsung.getMaxVolume()); 
		System.out.println(samsung.toString());
	}
}