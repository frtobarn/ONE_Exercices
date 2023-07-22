package com.bytebank.test;

public class TestWrappers {

	public static void main(String[] args) {
		Double doubleNumber = Double.valueOf(33.0);
		Boolean booleanValue = Boolean.valueOf(false);

		Double doubleNumber_2 = Double.valueOf(33);//
		Double doubleNumber_3 = Double.valueOf("33");//
		Integer integerNumber_3 = Integer.valueOf("33");//
		Number number = Integer.valueOf(117);
		double primitiveNumber = number.doubleValue();
		Integer integerNumberFromString = Integer.valueOf(new String("104"));//

		Boolean booleanVar = Boolean.valueOf(false);

		System.out.println(doubleNumber);
		System.out.println(doubleNumber_2);
		System.out.println(doubleNumber_3);
		System.out.println(number);
		System.out.println(primitiveNumber);
		System.out.println(booleanValue);
		System.out.println(integerNumberFromString + 13);

	}

}
