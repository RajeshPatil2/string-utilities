package com.emailutils.processing;

import java.util.Scanner;

public class ExtractEmailDomain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Email ID: ");
		String email = sc.next();

		if (email.contains("@")) {
			String domain = email.substring(email.indexOf("@") + 1);
			System.out.println("Email Domain: " + domain);
		} else {
			System.out.println("Invalid Email");
		}

	}

}
