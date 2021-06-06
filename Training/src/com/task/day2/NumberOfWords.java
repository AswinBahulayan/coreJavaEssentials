package com.task.day2;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = { "kkk", "bk6", "cc", "ggg" };
		System.out.println("Number of elements with 3 character : " + numberOfChar(a, 3));
	}

	public static int numberOfChar(String[] arr, int charLen) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == charLen) {
				counter++;
			}
		}
		return counter;
	}

}
