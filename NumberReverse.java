package com.cg;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int res=0;
		int sum=0;
		while(num>0) {
			res=num%10;
			sum=(sum*10)+res;
			num=num/10;
		}
		System.out.println(sum);

	}

}
