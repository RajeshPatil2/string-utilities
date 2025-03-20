package com.string.tocharconvert;

import java.util.List;
import java.util.stream.Collectors;

public class StringToConvertCharacters {

	public static void main(String[] args) {

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
