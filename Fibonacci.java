package com.cg;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int term=10;
		int first=0;
		int second=1;
		for(int i=0;i<=term;i++) {
			System.out.print(first+" ");
			
			int next= first + second;
			first=second;
			second =next;
		}

	}

}
