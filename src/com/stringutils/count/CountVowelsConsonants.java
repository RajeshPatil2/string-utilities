package com.stringutils.count;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");

		char[] charArray = sc.nextLine().toCharArray();

		int vowels = 0, consonants = 0;

		for (char ch : charArray) {
			if ("aeiou".contains(ch + ""))
				vowels = vowels + 1;
			else
				consonants = consonants + 1;
		}

		System.out.println("Vowels: " + vowels + "\nConsonants: " + consonants);
	}
}
