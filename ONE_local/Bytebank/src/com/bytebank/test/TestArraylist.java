package com.bytebank.test;

import java.util.Collection;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

import com.bytebank.model.Account;
import com.bytebank.model.NormalAccount;
import com.bytebank.model.SavingsAccount;

public class TestArraylist {

	public static void main(String[] args) {

		List<String> argumentos = Arrays.asList(args);
		System.out.println(argumentos);

		List<Account> list = new ArrayList<Account>();
		// Collection<Account> list = new ArrayList<Account>();
		// List<Account> list = new Vector<Account>(); thread safe, menos eficiente.
		// ArrayList<Account> list = new LinkedList<Account>();
		Account nAccount = new NormalAccount(11, 22);
		Account sAccount = new SavingsAccount(20, 55);
		Account sAccount2 = new SavingsAccount(20, 55);

		list.add(nAccount);
		list.add(sAccount);
		// list.add(sAccount2);

		Account objectAtZero = list.get(0);
		Account objectAtOne = list.get(1);
		System.out.println(objectAtZero);
		System.out.println(objectAtOne);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// foreach for each
		for (Account account : list) {
			System.out.println(account);
		}

		// Contains
		if (list.contains(sAccount2)) {
			System.out.println("La cuenta existe!\n\t" + nAccount);
		} else {
			System.out.println("La cuenta no existe");
		}

		//
		if (sAccount.isEqualsTo(sAccount2)) {
			System.out.println("Yes they are equals");
		}

	}

}
