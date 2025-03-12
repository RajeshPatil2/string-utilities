package com.emailutils.validation;

import java.util.Scanner;

public class ValidateEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email ID: ");
		String email = sc.next();

		// Simple regex for email validation
		String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}$";

		if (email.matches(regex)) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Email");
		}
	}

}
