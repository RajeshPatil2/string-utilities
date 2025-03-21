package com.logically.school;

/**
 * A train is 100 meters long and moves at a speed of 40 km/h. 
 * A person is walking in the same direction as the train at 10 km/h.
		1. Convert the speed of the train and the person from km/h to m/s.
		2.Find the relative speed between the train and the person.
		3.Calculate the time required for the train to completely pass the person.
 */

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
