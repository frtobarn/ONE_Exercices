package com.bytebank.test;

import com.bytebank.model.Accountant;
import com.bytebank.model.Official;

public class TestOfficial {

	public static void main(String[] args) {
		Official official = new Accountant("Fanto", "1033724677", 3000);
		System.out.println(official.getPayment());
		System.out.println(official.getBonus());
	}

}
