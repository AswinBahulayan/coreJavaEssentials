package com.task.week1;

public class Calculator {
	
	/*
	 *1.Create a calculator class to perform addition, subtraction, multiplication
	 * and division of two integers. Get inputs from command line/program arguments
	 */

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition : " + (a + b));
		System.out.println("Multiplication : " + (a * b));
		System.out.println("Division : " + (a % b));
	}

}