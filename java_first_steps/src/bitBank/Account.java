package bitBank;

public class Account {
	private double balance;
	private int agency;
	private int id;
	private Customer owner;
	private static int totalAccounts;

	public Account(int agency) {
		totalAccounts++;
		System.out.println("A new account has been created: " + this);
		System.out.println("Accounts created: " + totalAccounts);
		if (agency <= 0) {
			this.agency = 1;
		} else {
			this.agency = agency;
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
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getOwner() {
		return this.owner;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	
	//Class method to get totalAccounts
	public static int getTotalAccounts() {
		return Account.totalAccounts;
	}

	boolean deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

	boolean withdraw(double amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			return true;
		}
		return false;
	}

	boolean trensfer(double amount, Account accountToTransfer) {
		if (amount <= this.balance) {
			this.balance -= amount;
			accountToTransfer.deposit(amount);
			return true;
		}
		return false;
	}
}
