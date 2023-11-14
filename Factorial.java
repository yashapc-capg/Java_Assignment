package com.cg;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		double val= sc.nextDouble();
		double fact=1;
		while(val>1) {
			fact*= val;
			val--;
		}
		System.out.println("factorial: "+fact);
		
		sc.close();

	}

}
