package com.sue.spring;

import com.sue.java.AppleSpeaker;
import com.sue.java.HamanSpeaker;
import com.sue.java.SonySpeaker;
import com.sue.java.Speaker;

public class SpeakerFactory {
	public static Speaker choiceSpeaker(String brand) {
		switch(brand) {
		case "apple" :
			return new AppleSpeaker(30);
		case "sony" :
			return new SonySpeaker(40);
		case "haman" :
			return new HamanSpeaker(50);
		}
		return null;
	}
}