package com.thread.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class ParallelStreamExample {

	public static void main(String[] args) throws Exception {

		// Create a list of integers from 1 to 10
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Default parallel stream execution
		System.out.println("Default Parallel Stream Execution:");

		numbers.parallelStream()
				.peek(num -> 
				System.out.println(Thread.currentThread().
						getName() + " "
								+ "processing: " + num))
				.forEach(num -> {
				}); // Empty forEach ensures stream execution

		// Create a custom ForkJoinPool with 4 threads
		ForkJoinPool customThreadPool = new ForkJoinPool(4);

		System.out.println("\nCustom Parallel Stream Execution with 4 Threads:");

		// Submit a task to the custom ForkJoinPool
		customThreadPool.submit(() -> 
		numbers.parallelStream()
				.peek(num -> 
				System.out.println(Thread.currentThread().getName() + " processing: " + num))
				.forEach(num -> {
				})).get(); // Wait for the task to complete

		// Shutdown the custom thread pool
		customThreadPool.shutdown();
	}
}
