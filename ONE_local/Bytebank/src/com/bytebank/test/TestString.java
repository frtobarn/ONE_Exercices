package com.bytebank.test;

public class TestString {

	public static void main(String[] args) {
		String name = "Emilito";

		// Don't use this in the real world!!!
		String lastname = new String("Tobar");

		// Methods

		System.out.println(name);
		name.replace("o", "0");
		name.replace((char) 69, (char) 51);
		name.concat(" Juanito");
		System.out.println("String object is unmutable");
		System.out.println(name);
		// This method returns new string and it doesn't not replace the original value
		// So you can reassign the return of the ,method to the original variable
		System.out.println("\nReassignig name to name.method()");
		name = name.replace("o", "0");
		System.out.println(name);
		name = name.replace((char) 69, (char) 51);
		System.out.println(name);
		name = name.toUpperCase();
		System.out.println(name);
		char characterAt_1 = name.charAt(0);
		char characterAt_5 = name.charAt(5);
		System.out.println(characterAt_1);
		System.out.println(characterAt_5);
		int positionOfCharacter_0 = name.indexOf('0');
		System.out.println(positionOfCharacter_0);

	}

}
