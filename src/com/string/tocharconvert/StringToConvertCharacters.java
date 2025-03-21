package com.string.tocharconvert;

import java.util.List;
import java.util.stream.Collectors;

//Q.] How do you convert a List<String> into a List<Character> using Java Streams?

public class StringToConvertCharacters {

	/*
	 * How do you convert a List<String> into a List<Character> using Java Streams?
	 */
	public static void main(String[] args) {

<<<<<<< HEAD
		// In Java 9+, we can use List.of("Rajesh", "Krishn")
		// But in Java 8, List.of() is NOT available, so we use Arrays.asList()
		List<String> words = List.of("Rajesh", "Krishn");
=======
	// In Java 9+, we can use List.of("Rajesh", "Krishn")
	// But in Java 8, List.of() is NOT available.
        List<String> words = List.of("Rajesh", "Krishn");
>>>>>>> 14418af99ed37d5cc054ffbf87a0ad61ca8850a2

		// [R, a, j, e, s, h, K, r, i, s, h, n, a]

		// Convert String to Character List
		List<Character> characters = words.stream().flatMap((String word) -> word.chars().mapToObj((int c) -> (char) c))
				.collect(Collectors.toList());

		System.out.println(characters);

	}

}
