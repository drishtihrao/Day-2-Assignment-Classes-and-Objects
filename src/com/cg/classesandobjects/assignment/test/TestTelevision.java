package com.cg.classesandobjects.assignment.test;
/*
 * This class is implementing the methods of Television class
 * The TV can be turned on and off, the channels can be changed and the volume can be decreased or increased
 */
import java.util.Scanner;

import com.cg.classesandobjects.assignment.Television;

public class TestTelevision {
	public static void main(String[] args) {
		Television television = new Television();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Do you want to turn on the TV? If yes, enter 1. Otherwise enter 0");
		int tvState = scanner.nextInt();
		if (tvState == 1) {
			television.setState(true);
			System.out.println("Turning on the TV");
		} else {
			television.setState(false);
			System.out.println("TV is off");
		}

		System.out.println(television.isState());

		// Checking the channel number
		System.out.println("The current channel is: " + television.getCurrentChannelNumber());

		System.out.println("Do you want to change the channel? If yes, enter 1. Otherwise enter 0");
		int channel = scanner.nextInt();
		if (channel == 1) {
			System.out.println("Enter channel number");
			television.setCurrentChannelNumber(scanner.nextInt());
			System.out.println("The current channel number is: " + television.getCurrentChannelNumber());
		} else {
			System.out.println("The current channel number is: " + television.getCurrentChannelNumber());
		}

		// Making Volume adjustments
		System.out.println("The current volume is: " + television.getCurrentVolume());

		System.out.println("Do you want to change the Volume?");
		int volume = scanner.nextInt();
		if (volume == 1) {
			System.out.println("press 1 to increase the volume and press 0 to decrease the volume");
			int change = scanner.nextInt();
			if (change == 1) {
				System.out.println("By how much do you want your volume increased?");
				television.increaseVolume(scanner.nextInt());
				System.out.println("The current channel volume is: " + television.getCurrentVolume());
			} else if (change == 0) {
				System.out.println("By how much do you want your volume decreased?");
				television.decreaseVolume(scanner.nextInt());
				System.out.println("The current channel volume is: " + television.getCurrentVolume());
			} else {
				System.out.println("The current channel volume is: " + television.getCurrentVolume());
			}
		} else {
			System.out.println("The current channel volume is: " + television.getCurrentVolume());
		}

		System.out.println("Do you want to turn off the TV? If yes, enter 1. Otherwise enter 0");
		int state = scanner.nextInt();
		if (state == 1) {
			television.setState(false);
			System.out.println("Turning off the TV");
		} else {
			television.setState(true);
			System.out.println("TV is still on");
		}
	}
}
