package com.cg.classesandobjects.assignment;
/*
 * This class defines methods to make adjustments in volume or change the channel of the TV
 * The TV can be turned on and off, the channels can be changed and the volume can be decreased or increased
 */
public class Television {
	private boolean state = false;
	private int currentVolume = 10;
	private int currentChannelNumber = 1;

	// state is true for on and false for "off"
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	// Volume adjustment
	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		if (currentVolume >= 0 && currentVolume <= 100)
			this.currentVolume = currentVolume;
	}

	public int increaseVolume(int increasedVolume) {
		this.currentVolume += increasedVolume;
		return this.currentVolume;
	}

	public int decreaseVolume(int decreasedVolume) {
		currentVolume -= decreasedVolume;
		return currentVolume;
	}

	// Channel Adjustments
	public int getCurrentChannelNumber() {
		return currentChannelNumber;
	}

	public void setCurrentChannelNumber(int currentChannelNumber) {
		if (currentChannelNumber >= 0 && currentChannelNumber <= 500)
			this.currentChannelNumber = currentChannelNumber;
	}
}
