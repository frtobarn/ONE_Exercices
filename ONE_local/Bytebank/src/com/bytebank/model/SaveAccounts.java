package com.bytebank.model;

public class SaveAccounts {
	// Create an object to store many accounts
	Account[] accountList = new Account[10];
	int index = 0;

	public void addNewAccount(Account account) {
		accountList[index] = account;
		index++;
	}

	public Account getAccount(int position) {
		return accountList[position];
	}
}
