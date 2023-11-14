package com.cg;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a word:");
		String str= sc.next();
		
		StringBuilder sb = new StringBuilder(str);
		
		
		if(str.equals(sb.reverse().toString())) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}

		sc.close();
	}

}
