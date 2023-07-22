package com.bytebank.model;

/**
 * 
 * Account help to create new Account instances, savings and normal
 * 
 * @version 1.0
 * 
 * 
 * @author f4nt0
 *
 */

public abstract class Account implements Comparable<Account> {
	protected double balance;
	private int agency;
	private int accountId;
	private Customer owner = new Customer();
	private static int totalAccounts;

	/**
	 * Create a new Account instance without parameters
	 */
	public Account() {
		// super();
		totalAccounts++;
		System.out.println("A new account has been created: " + this);
		System.out.println("Accounts created: " + totalAccounts);
	}

	/**
	 * Create a new Account instance with parameters agency and accountId
	 * 
	 * @param agency
	 * @param accountId
	 * 
	 */
	public Account(int agency, int accountId) {
		totalAccounts++;
		System.out.println("A new account has been created: " + this);
		System.out.println("Accounts created: " + totalAccounts);
		if (agency <= 0) {
			this.agency = 1;
		} else {
			this.agency = agency;
		}
		if (accountId <= 0) {
			this.accountId = 1;
		} else {
			this.accountId = accountId;
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getAgency() {
		return agency;
	}

	public boolean setAgency(int agency) {
		if (agency > 0) {
			this.agency = agency;
			return true;
		}
		return false;
	}

	public int getId() {
		return accountId;
	}

	public void setId(int id) {
		this.accountId = id;
	}

	public Customer getOwner() {
		return this.owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	// Class method to get totalAccounts
	public static int getTotalAccounts() {
		return Account.totalAccounts;
	}

	public abstract boolean deposit(double amount);

	/**
	 * Withdraw an amount from current account
	 * 
	 * @param amount
	 * @throws NotEnoughException
	 */
	public void withdraw(double amount) throws NotEnoughException {
		if (this.balance < amount) {
			throw new NotEnoughException("You don't have enough money");
		}
		this.balance -= amount;
	}

	public boolean transfer(double amount, Account accountToTransfer) {
		if (this.balance >= amount) {
			try {
				this.withdraw(amount);
			} catch (NotEnoughException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			accountToTransfer.deposit(amount);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cuenta con agencia " + this.agency + "\t Id: " + this.accountId + "\t Owner: " + this.owner.getName()
				+ "\t# @" + Integer.toHexString(hashCode()) + "\tSaldo: " + this.balance;
	}

	// Deprecated, replaced by equals override
	public boolean isEqualsTo(Account account) {
		return this.agency == account.agency && this.accountId == account.accountId;
	}

	// New values based method equals
	@Override
	public boolean equals(Object account) {
		Account castedAccount = (Account) account;
		return this.agency == castedAccount.agency && this.accountId == castedAccount.accountId;
	}

	// Implementing comparable before Java 8/ old way
	@Override
	public int compareTo(Account account) {
		// Natural order by agency
		return Integer.compare(this.agency, account.getAgency());
		// Double.compare(this.balance, account.getBalance());
	}
}
