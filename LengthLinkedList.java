package com.cg;

import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LengthLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> a = new LinkedList<>();

		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);

		System.out.println(a.stream().count());

	}

}
