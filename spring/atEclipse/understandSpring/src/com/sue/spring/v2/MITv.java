package com.sue.spring.v2;

import com.sue.java.Speaker;

public class MITv {
	private Speaker speaker;
	
	public MITv() {
		System.out.println("MITv 기본 생성자");
	}
	
	public MITv(Speaker speaker) {
		System.out.println("MITv speaker 생성자");
		this.speaker = speaker;
	}
}