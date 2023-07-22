package com.bytebank.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.bytebank.model.Account;
import com.bytebank.model.Customer;
import com.bytebank.model.NormalAccount;
import com.bytebank.model.SavingsAccount;

public class TestListSorting {

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

		// before sorting list
		System.out.println("before sorting list...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by
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

		// After sorting list
		System.out.println("before sorting list by account Id...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by owner's name
		// Comparator <? extends Account> c
		Comparator<Account> comparatorByOwnersName = new OrdererByAccountOwner();
		lista.sort(comparatorByOwnersName);

		// After sorting list by owner's name
		System.out.println("before sorting list by owner's name...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by owner's name
		// Comparator <? extends Account> c
		Comparator<Account> comparatorByAgency = new OrdererByAccountAgency();
		lista.sort(comparatorByAgency);
		// After sorting list by agency number
		System.out.println("before sorting list by agency...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Sorting Accounts by account's balance
		// Comparator <? extends Account> c
		lista.sort(new OrdererByBalance());// Functional interface
		// After sorting list by agency number
		System.out.println("before sorting list by balance...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Before java 8.1 you must to use collections
		Collections.sort(lista, new OrdererByAccountId());// Interface implementation
		// After sorting list by account id
		System.out.println("before sorting list by account id...");
		for (Account account : lista) {
			System.out.println(account);
		}

		// Collections natural order
		Collections.sort(lista);
		// After sorting list by account id
		System.out.println("before sorting list by natural order");
		for (Account account : lista) {
			System.out.println(account);
		}
	}

}

//Basic Way
class OrdererByAccountId implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		if (o1.getId() == o2.getId()) {
			return 0;
		} else if (o1.getId() > o2.getId())
			return 1;
		else {
			return -1;
		}
	}

}

//String way
class OrdererByAccountOwner implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getOwner().getName().compareTo(o2.getOwner().getName());
	}

}

//Intermediate way
class OrdererByAccountAgency implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getAgency() - o2.getAgency();
	}

}

//Wrapper way
class OrdererByBalance implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return Integer.compare((int) o1.getBalance(), (int) o2.getBalance());
	}

}
