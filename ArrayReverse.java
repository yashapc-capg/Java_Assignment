package com.cg;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {16,35,351,64,234,12,51,92};
		int res[]= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[arr.length-i-1];
		}
		System.out.println(Arrays.toString(res));

	}

}
