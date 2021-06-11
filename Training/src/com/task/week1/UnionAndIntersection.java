package com.task.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.processing.SupportedSourceVersion;

public class UnionAndIntersection {
	/*
	 * 10.Find A union B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; Sample
	 * output: int[] c={1,2,3,4,5,6}
	 * 
	 * 11.Find A interscetion B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6};
	 * Sample output: int[] c={3,4}
	 * 
	 * 12.Find (A union B) - (A intersection B) Sample input: int[] a={1,2,3,4};
	 * int[] b={3,4,5,6}; a union b = {1,2,3,4,5,6} a intersection b = {3,4} (a
	 * union b) - (a intersection b) = {1,2,5,6} Sample output: int[] c={1,2,5,6}
	 */

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		System.out.print("union : ");
		printResult(union(a, b));
		System.out.print("intersection : ");
		printResult(intersection(a, b));
		System.out.print("union minus intersection : ");
		printResult(unionMinusIntersection(a, b));
	}

	static ArrayList<Integer> union(int[] a, int[] b) {
		int[] union = mergeArray(a, b);
		Set<Integer> resultUnion = new TreeSet<>();
		for (int i = 0; i < union.length; i++) {
			resultUnion.add(union[i]);
		}
		ArrayList<Integer> listUnion = new ArrayList<>();
		listUnion.addAll(resultUnion);
		return listUnion;
	}

	static ArrayList<Integer> intersection(int[] a, int[] b) {
		Set<Integer> intersection = new TreeSet<>();
		ArrayList<Integer> intersectionResults = new ArrayList<>();
		int[] mergedArray = mergeArray(a, b);
		for (int i = 0; i < mergedArray.length; i++) {
			for (int j = i + 1; j < mergedArray.length; j++) {
				if (mergedArray[i] == mergedArray[j]) {
					intersection.add(mergedArray[i]);
				}
			}
		}
		intersectionResults.addAll(intersection);
		return intersectionResults;
	}

	static ArrayList<Integer> unionMinusIntersection(int[] a, int[] b) {
		ArrayList<Integer> intersection = intersection(a, b);
		ArrayList<Integer> union = union(a, b);
		for (Integer integer : intersection) {
			if (union.contains(integer)) {
				union.remove(integer);
			}
		}
		return union;
	}

	static int[] mergeArray(int[] a, int[] b) {
		int counter = 0;
		int[] union = new int[a.length + b.length];
		for (int i = 0; i < union.length; i++) {
			if (i < a.length) {
				union[i] = a[i];
			} else {
				union[i] = b[counter];
				counter++;
			}
		}
		return union;
	}
	
	static void printResult(ArrayList<Integer> result) {
		for (Integer integer : result) {
			System.out.print(integer + ", ");
		}
		System.out.println();
	}

}
