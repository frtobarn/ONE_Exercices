package com.bytebank.test;

import com.bytebank.model.Account;
import com.bytebank.model.Customer;
import com.bytebank.model.NormalAccount;
import com.bytebank.model.SavingsAccount;

public class TestArrayReferences {

	public static void main(String[] args) {
		// Account[] ccArray = new Account[10];
		Object[] references = new Object[10];

		NormalAccount cc = new NormalAccount(22, 0);
		references[0] = cc;

		SavingsAccount sc = new SavingsAccount();
		references[1] = sc;

		Customer customer = new Customer();
		references[3] = customer;

		System.out.println("\n\nLoop start");
		for (int i = 0; i < references.length; i++) {
			if (references[i] == null) {
				references[i] = new NormalAccount(i, i);
			} else {
				System.out.println("Cuenta antigua: \n\t♪• Type: " + references.getClass() + "\t" + references[i]);
			}
		}

		// Getting a normal account from array
		NormalAccount newAccount = (NormalAccount) references[0];
		System.out.println(newAccount);

		// Getting a normal account from array
		Customer returnedCustomer = (Customer) references[3];
		System.out.println(returnedCustomer);

	}

}
