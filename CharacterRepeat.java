package com.cg;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CharacterRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a string: ");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		List<Character> alist= new LinkedList<>();
		Set<Character> result= new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			if(!alist.contains(str.charAt(i)) ) {
				alist.add(str.charAt(i));
			}else {
				result.add(str.charAt(i));
			}
		}
		result.remove(' ');
		System.out.println(result);
		

	}

}
