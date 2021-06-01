package com.sue.java;

public class Speaker {
	private String brand;
	private int maxVolume;
	private int currentVolume;
	
	public Speaker(String brand, int maxVolume) {
		super();
		this.brand = brand;
		this.maxVolume = maxVolume;
	}
		
	public String getBrand() {
		return brand;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
	
	public void volumeUp() {
		if(currentVolume < maxVolume) {
			currentVolume++;
		}
	}
	
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
		}
	}
}
