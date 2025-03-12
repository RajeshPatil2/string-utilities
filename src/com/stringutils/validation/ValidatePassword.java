package com.stringutils.validation;

import java.util.Scanner;

public class ValidatePassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password: ");
		String password = sc.next();

		// Password must have at least 8 characters, 1 uppercase, 1 lowercase, 1 digit,
		// and 1 special character
		if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") &&

				password.matches(".*\\d.*") && password.matches(".*[@#$%^&+=].*") &&

				password.length() >= 8) {

			System.out.println("Strong Password");
		} else {
			System.out.println("Weak Password");
		}
	}

}
