package com.cg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number:");
		int num=sc.nextInt();
		boolean value=false;
		if(num<0) {
			System.out.println("enter a positive number");
		}
		if(num==0 || num==1) {
			System.out.println("not a prime");
			
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("not a prime");
				value =false;
				break;
			}else {
				value=true;
			}
		}
		
		if(value==true) {
			System.out.println("prime number");
		}
		
		sc.close();
		

	}

}
