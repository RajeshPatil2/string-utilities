package com.logically.school;

import java.util.Scanner;

/**
 * A company provides bonuses to its employees based on the following rules:
 * 
 * If an employee has more than 5 years of experience and a salary greater than
 * 50,000, they will receive a 20% bonus. 
 * If an employee has more than 5 years of experience but a salary of 50,000 or less, 
 * they will receive a 15% bonus.
 * If an employee has less than 5 years of experience and a salary greater than
 * 30,000, they will receive a 10% bonus. Otherwise, they will receive a 5%
 * bonus.
 */

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
