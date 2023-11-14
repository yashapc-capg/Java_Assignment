package com.cg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		int num=input;
		int val=num;
		int count=0;
		int n=0;
		int sum=0;
		
		while(val>0) {
			val=val/10;
			count++;
		}
		while(num>0) {
			n=num%10;
			sum += (int)Math.pow(n,count);
			num=num/10;
		}
		if(sum==input) {
			System.out.println("Armstrong number:" +sum);
		}else {
			System.out.println("Not a armstrong number." +sum);
		}

	}

}
