package com.cg;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ek = "hello";
		String str = "loleh";

		if (ek.length() != str.length()) {
			System.out.println("Not anagrams");
		}
		char arr[] = ek.toCharArray();
		char arr1[] = str.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(arr1);
		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr1[i]) {
				System.out.println("Not anagrams");
				b = false;
				break;
			} else {
				b = true;
			}
		}
		if (b == true) {
			System.out.println("Anagrams");
		}

	}

}
