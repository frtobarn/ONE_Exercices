package classes;

public class NormalAccount extends Account {

	public NormalAccount(int agency) {
		super(agency);
	}

	@Override
	boolean withdraw(double amount) {
		double commission = 0.2;
		return super.withdraw(amount + commission);
	}

	@Override
	boolean deposit(double amount) {

		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

}
