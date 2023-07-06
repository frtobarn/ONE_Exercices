package byteBank;

public class TestPoli {

	public static void main(String[] args) {

		NormalAccount normalAccount = new NormalAccount(1);
		SavingsAccount savingsAccount = new SavingsAccount(2);
		
		normalAccount.deposit(2000);
		normalAccount.transfer(1000, savingsAccount);
		
		System.out.println(normalAccount.getBalance());
		System.out.println(savingsAccount.getBalance());

	}

}
