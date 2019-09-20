package com.org.exception;

public class CalculateAverage02 {
	
	public static void main(String[] args) {
		printAverage(100, 20);
		System.out.println("Exit Main().");
	}
	
	public static void printAverage (int totalSum, int totalNumber) {
		try {
			int average = computeAverage(totalSum, totalNumber);
			System.out.println("Average:" + totalSum 
					+ "/" + totalNumber + "=" + average);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception handled in printAverage()");
		}finally{
			System.out.println("Finally done.");
		}
		System.out.println("Exit printAverage.");
	}
	
	public static int computeAverage (int sum, int number) {
		System.out.println("Computing Average.");
		return sum/number;
	}
}
