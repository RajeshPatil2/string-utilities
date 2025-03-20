package com.string.tocharconvert;

import java.util.List;
import java.util.stream.Collectors;

//Q.] How do you convert a List<String> into a List<Character> using Java Streams?

public class StringToConvertCharacters {

	public static void main(String[] args) {

	// In Java 9+, we can use List.of("Rajesh", "Krishn")
	// But in Java 8, List.of() is NOT available.
        List<String> words = List.of("Rajesh", "Krishn");

		// [R, a, j, e, s, h, K, r, i, s, h, n, a]

		// Convert String to Character List
		List<Character> characters = words.stream()
				.flatMap((String word) -> word.chars()
						.mapToObj((int c) -> (char) c))
				.collect(Collectors.toList());
		
		System.out.println(characters);

	}

}
