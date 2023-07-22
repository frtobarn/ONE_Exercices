package com.bytebank.model;

public class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int agency, int accountId) {
		super(agency, accountId);
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

}
