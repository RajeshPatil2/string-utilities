package com.stringutils.validation;

import java.util.Scanner;

public class ValidateName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name: ");

		String firstName = sc.next();

		System.out.print("Enter Last Name: ");
		String lastName = sc.next();

		// Name should start with a capital letter and contain only letters
		String regex = "^[A-Z][a-zA-Z]*$";

		if (firstName.matches(regex) && lastName.matches(regex)) {
			System.out.println("Valid Name");
		} else {
			System.out.println("Invalid Name");

		}

	}

}
