package com.bytebank.model;

public class NormalAccount extends Account {

	public NormalAccount(int agency, int accountId) {
		super(agency, accountId);
	}

	@Override
	public void withdraw(double amount) throws NotEnoughException {
		double commission = 0.2;
		super.withdraw(amount + commission);
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
