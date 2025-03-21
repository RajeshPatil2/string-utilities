package com.logically.school;

import java.util.Map;

public class TrafficSignal {
	public static void main(String[] args) {

		Map<String, String> signalActions = Map.of(
				"Red", "Stop", 
				"Yellow", "Get Ready", 
				"Green", "Go");

		String signal = "Green";

		System.out.println(signalActions.getOrDefault(signal, "Invalid Signal"));
	}
}
