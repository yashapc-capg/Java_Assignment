package com.cg;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int val= sc.nextInt();
		int n=Math.abs(val);
		int m=n;
		int num=0;
		int res=0;
		while(n>0) {
			res= n%10 ;
			num=(num*10)+res;
			n=n/10;
			
		}
		if(m==num) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		sc.close();

	}

}
