package classes;

public abstract class Account {
	protected double balance;
	private int agency;
	private int accountId;
	private Customer owner;
	private static int totalAccounts;

	public Account() {

	}

	public Account(int agency, int accountId) {
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

	abstract boolean deposit(double amount);

	public void withdraw(double amount) throws NotEnoughException {
		if (this.balance < amount) {
			throw new NotEnoughException("You don't have enough money");
		}
		this.balance -= amount;
	}

	boolean transfer(double amount, Account accountToTransfer) {
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
}
