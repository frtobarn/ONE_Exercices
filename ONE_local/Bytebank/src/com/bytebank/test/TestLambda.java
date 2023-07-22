package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.model.Account;
import com.bytebank.model.Customer;
import com.bytebank.model.NormalAccount;
import com.bytebank.model.SavingsAccount;

public class TestLambda {

	public static void main(String[] args) {
		Account cc1 = new NormalAccount(7, 33);
		Customer clienteCC1 = new Customer();
		clienteCC1.setName("Nico");
		cc1.setOwner(clienteCC1);
		cc1.deposit(333.0);

		Account ca2 = new SavingsAccount(22, 44);
		Customer clienteCC2 = new Customer();
		clienteCC2.setName("Guilermo");
		ca2.setOwner(clienteCC2);
		ca2.deposit(444.0);

		Account cc3 = new NormalAccount(3, 11);
		Customer clienteCC3 = new Customer();
		clienteCC3.setName("Paulo");
		cc3.setOwner(clienteCC3);
		cc3.deposit(1110.0);

		Account ca4 = new SavingsAccount(5, 1);
		Customer clienteCC4 = new Customer();
		clienteCC4.setName("Ana");
		ca4.setOwner(clienteCC4);
		ca4.deposit(222.0);

		List<Account> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(ca2);
		lista.add(cc3);
		lista.add(ca4);

		// before sorting
		// list-------------------------------------------------------------------------
		System.out.println("before sorting list...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by account
		// ID------------------------------------------------------------------------------------
		// Comparator <? extends Account> c
		// Comparator<Account> comparator = new OrdererByAccountId();
		// lista.sort(comparator);
		lista.sort(new Comparator<Account>() {// Anonymous class

			@Override
			public int compare(Account o1, Account o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getId(), o2.getId());
			}

		});
		// After sorting list by account Id
		System.out.println("After sorting list by account Id...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by owner's
		// name-----------------------------------------------------------------------------------------
		// Comparator <? extends Account> c
		// Comparator<Account> comparatorByOwnersName = new OrdererByAccountOwner();
		// lista.sort(comparatorByOwnersName);
		lista.sort(new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				// TODO Auto-generated method stub
				return o1.getOwner().getName().compareTo(o2.getOwner().getName());
			}
		});
		// After sorting list by owner's name
		System.out.println("After sorting list by owner's name...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by
		// agency-----------------------------------------------------------------------------------------
		// Comparator <? extends Account> c
		// Comparator<Account> comparatorByAgency = new OrdererByAccountAgency();
		// lista.sort(comparatorByAgency);
		lista.sort(new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				// TODO Auto-generated method stub
				return o1.getAgency() - o2.getAgency();
			}
		});
		// After sorting list by agency number
		System.out.println("After sorting list by agency...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by account's
		// balance--------------------------------------------------------------------------------------------
		// Comparator <? extends Account> c
		// lista.sort(new OrdererByBalance());// Functional interface
		lista.sort((Account o1, Account o2) -> // Lambda function
		(int) (o1.getBalance() - o2.getBalance()));

		// After sorting list by agency number
		System.out.println("After sorting list by balance...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by account owner's
		// name------------------------------------------------------------------------------------------------

		Collections.sort(lista, (account1, account2) -> {
			return account1.getOwner().getName().compareTo(account2.getOwner().getName());
		});// LambdaFunction

		// After sorting list by account id
		System.out.println("After sorting list by account owner's name using colletions.sort.....................");
		lista.forEach(account -> System.out.println(account));// Consumer functional interface

		// Sorting Accounts by class's
		// natural
		// order------------------------------------------------------------------------------------------------
		// Before java 8.1 you must to use collections
		Collections.sort(lista, new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
		});// Interface implementation
			// After sorting list by account id
		System.out.println("After sorting list by account id...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Collections natural order
		Collections.sort(lista);
		// After sorting list by account id
		System.out.println("After sorting list by natural order");
		for (Account account : lista) {
			System.out.println(account);
		}

	}

}
