/**
 * 
 */
package com.ss.a1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Jacob
 *
 */
public class LambdaPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = { "hello", "world", "distraction", "fear" };
		arr = sortByLength(arr);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		arr = sortByReverseLength(arr);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		arr = sortAlphabetically(arr);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		arr = sortEFirst(arr);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		arr = sortByReverseLength(arr);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("-------------------------------");
		arr = sortEHelper(arr);
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("-------------------------------");
	}

	private static String[] sortByReverseLength(String[] arr) {

		Arrays.sort(arr, (a, b) -> Integer.signum(b.length() - a.length()));
		;
		return arr;
	}

	private static String[] sortByLength(String[] arr) {
		Arrays.sort(arr, (a, b) -> Integer.signum(a.length() - b.length()));
		return arr;
	}

	private static String[] sortAlphabetically(String[] arr) {
		Arrays.sort(arr, (a, b) -> Integer.signum(a.charAt(0) - b.charAt(0)));
		return arr;
	}

	private static String[] sortEFirst(String[] arr) {
		Arrays.sort(arr, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
		return arr;
	}

	private static String[] sortEHelper(String[] arr) {
		Arrays.sort(arr, Comparator.comparingInt(a -> Util.yourMethod(a)));
		return arr;
	}

}

class Util {
	static int yourMethod(String s1) {
		return (s1.contains("E") || s1.contains("e") ? 0 : 1);
	}
}
