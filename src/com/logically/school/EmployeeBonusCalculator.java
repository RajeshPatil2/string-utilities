package com.logically.school;

import java.util.Scanner;

public class EmployeeBonusCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter experience in years: ");
		double experience = scanner.nextDouble();

		System.out.print("Enter salary: ");
		double salary = scanner.nextDouble();

		double bonusPercentage;

		// Bonus calculation based on conditions
		if (experience > 5 && salary > 50000) {
			bonusPercentage = 20;
		} else if (experience > 5) {
			bonusPercentage = 15;
		} else if (salary > 30000) {
			bonusPercentage = 10;
		} else {
			bonusPercentage = 5;
		}

		// Calculate bonus and total salary
		double bonusAmount = (salary * bonusPercentage) / 100;
		double totalSalary = salary + bonusAmount;

		System.out.println("Bonus amount: " + bonusAmount);
		System.out.println("Total salary after bonus: " + totalSalary);

		scanner.close();
	}
}
