package com.logically.school;

/**
 * Question: A school initially prepared 2000 exam papers. Out of these, 1500
 * papers were distributed to students. Later, 300 extra papers were printed. 
 * 1.Compute the total number of exam papers remaining after distribution. 
 * 2.Calculate the final number of exam papers available after adding the extra
 * printed papers.
 */
public class ExamPapers {
	public static void main(String[] args) {
		// 1: Initial number of exam papers
		int totalPapers = 2000;

		// 2: Papers distributed to students
		int distributedPapers = 1500;
		int remainingPapers = totalPapers - distributedPapers;

		// 3: Extra papers printed
		int extraPrinted = 300;
		int finalPapersAvailable = remainingPapers + extraPrinted;

		System.out.println("Remaining exam papers after distribution: " + remainingPapers);
		System.out.println("Final available exam papers after printing extra: " + finalPapersAvailable);
	}
}
