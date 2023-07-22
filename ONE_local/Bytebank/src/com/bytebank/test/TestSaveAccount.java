package com.bytebank.test;

import com.bytebank.model.Account;
import com.bytebank.model.NormalAccount;
import com.bytebank.model.SaveAccounts;

public class TestSaveAccount {

	public static void main(String[] args) {
		SaveAccounts saveAccounts = new SaveAccounts();
		Account normalAccount1 = new NormalAccount(1, 550);
		Account normalAccount2 = new NormalAccount(2, 220);

		saveAccounts.addNewAccount(normalAccount1);
		saveAccounts.addNewAccount(normalAccount2);

		System.out.println(saveAccounts.getAccount(0));
		System.out.println(saveAccounts.getAccount(1));
	}
}
