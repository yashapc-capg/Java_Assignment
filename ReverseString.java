package com.cg;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a line: ");
		String str= sc.nextLine();
		StringBuilder sb= new StringBuilder(str);
		System.out.println("Reverse line: "+sb.reverse().toString());
		
		sc.close();

	}

}
