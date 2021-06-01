package com.spring.first;

public class MITv {
	private Speaker speaker;
	
	public MITv() {
		System.out.println("MITv 기본 생성자");
	}
	
	public MITv(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("MITv speaker 생성자");
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void volumeUp() {
		speaker.volumeUp(); // 기본 생성자가 없어서 에러 터짐
	}

}