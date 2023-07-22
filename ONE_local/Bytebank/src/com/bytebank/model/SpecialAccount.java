package com.bytebank.model;

public class SpecialAccount extends Account {

	@Override
	public boolean deposit(double amount) {
		super.balance += amount;
		return false;
	}

}
