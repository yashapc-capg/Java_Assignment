package com.cg;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReapeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,4,5,2,4,1,4};
		List<Integer> alist= new LinkedList<>();
		for(int i=0;i<arr.length;i++) {
			if(!alist.contains(arr[i])) {
				alist.add(arr[i]);
			}
		}
		
		System.out.println(alist);
		
	}
}
