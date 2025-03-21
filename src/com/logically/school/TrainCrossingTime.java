package com.logically.school;

public class TrainCrossingTime {
	public static void main(String[] args) {

		double trainLength = 100;
		double trainSpeed = 40;
		double personSpeed = 10;

		// Convert speed from km/h to m/s (1 km/h = 5/18 m/s)
		double trainSpeedMs = trainSpeed * (5.0 / 18);
		double personSpeedMs = personSpeed * (5.0 / 18);

		// Relative speed (since person is moving in same direction)
		double relativeSpeed = trainSpeedMs - personSpeedMs;

		System.out.println("Relative Speed : " + relativeSpeed);
		// Time to cross the person
		double time = trainLength / relativeSpeed;

		System.out.printf("Time required for the train to completely pass the person: %.2f seconds\n", time);
	}
}
