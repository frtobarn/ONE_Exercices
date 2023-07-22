package com.bytebank.test;

import java.util.List;
import java.util.ArrayList;

public class TestReviewArray {

	public static void main(String[] args) {
		// int[] numbers = new int[10];
		int number = 40;

		// WRAPPER Integer
		// Auto boxing
		// Integer intObject = new Integer(40);
		Integer intObject = Integer.valueOf(40);

		List<Integer> list = new ArrayList<>();
		// list.add(number);// Autoboxing add(new Integer(40))
		// list.add(new Integer(number));// Deprecated
		list.add(Integer.valueOf(number));
		list.add(intObject);//
		System.out.println(list);

		// Unboxing
		int primitiveValue = intObject;// Automatic returns intObject.intValue();
		System.out.println(primitiveValue);

		// other instancemethods
		System.out.println(intObject.byteValue());
		System.out.println(intObject.doubleValue());
		System.out.println(intObject.floatValue());
		System.out.println(intObject.byteValue());

		//
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		// WRAPPER
	}

}
