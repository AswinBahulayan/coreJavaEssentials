package com.task.week1;

public class MaxMin {

	/*
	 * 3.Find the sum of maximum and minimum number from a given input array
	 * Input:{19,17,12} max - 19 min - 12 sum - 31 Output:31
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 19, 20, 30, 54, 45, 84, 11, 10, 60, 7 };
		int max = 0, min = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					max = a[i];
					a[i] = a[j];
					a[j] = max;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					min = a[i];
					a[i] = a[j];
					a[j] = min;
				}
			}
		}
		System.out.println("max value : " + max);
		System.out.println("min value : " + min);
		System.out.println("Sum : " + (max - min));
	}

}
