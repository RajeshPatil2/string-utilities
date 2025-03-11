package com.stringutils.palindrome;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");

		String str = sc.nextLine();

		String rev = new StringBuilder(str).reverse().toString();

		System.out.println(str.equals(rev));

		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
