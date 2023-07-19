package bytebank;

public class SavingsAccount extends Account {

	public SavingsAccount(int agency) {
		super(agency);
	}
	@Override
	public boolean deposit(double amount) { 
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

}
