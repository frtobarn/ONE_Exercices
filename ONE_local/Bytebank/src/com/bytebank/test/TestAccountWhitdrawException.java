package com.bytebank.test;

import com.bytebank.model.Account;
import com.bytebank.model.NotEnoughException;
import com.bytebank.model.SavingsAccount;

public class TestAccountWhitdrawException {

	public static void main(String[] args) {
		Account account = new SavingsAccount(1, 0);
		account.deposit(1000);
		try {
			account.withdraw(1001);
		} catch (NotEnoughException e) {
			e.printStackTrace();
		}
		System.out.println("Proccess ended by Fanto");
	}

}
