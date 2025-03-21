package com.logically.school;

/**
 * Q.] A school had 500 students. Out of them, 50 students were absent, and 30
 * new students joined. There are 257 girls and 98 boys. Find out the total
 * number of students present in the school and calculate how many transgender
 * students are there."
 */
public class SchoolStudents {
	public static void main(String[] args) {
		int totalStudents = 500;
		int absentStudents = 50;
		int newAdmissions = 30;

		// Calculate the number of present students
		int presentStudents = totalStudents - absentStudents + newAdmissions;

		int girls = 257;
		int boys = 98;

		// Calculate the number of transgender students
		// Transgender students = Total present students - (Girls + Boys)
		int transgender = presentStudents - (girls + boys);

		System.out.println("Total students present in school: " + presentStudents);
		System.out.println("Number of transgender students: " + transgender);
	}
}
