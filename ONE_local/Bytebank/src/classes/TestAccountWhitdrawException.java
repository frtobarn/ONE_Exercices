package classes;

public class TestAccountWhitdrawException {

	public static void main(String[] args) {
		Account account = new SavingsAccount(1, 0);
		account.deposit(1000);
		try {
			account.withdraw(1001);
		} catch (NotEnoughException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
