package com.cg;

import java.util.LinkedList;
import java.util.List;

public class MidEleLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> a = new LinkedList<>();
		a.add(1);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);

		List<Integer> list = a.stream().toList();

		int middleIndex = list.size() / 2;
		int middleElement = list.get(middleIndex);

		System.out.println("Middle element of the LinkedList is : " + middleElement);

	}

}
