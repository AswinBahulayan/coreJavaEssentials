package com.task.week1;

public class NumberOfWords {
	
	/*4.Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”} Input2:2 Output1:2

	Input1:{“aa”,”b”,”cc”,”ddd”} Input2:1 Output1:1

	Input1:{“aa”,”b”,”cc”,”ddd”} Input2:3 Output1:1*/
	
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
