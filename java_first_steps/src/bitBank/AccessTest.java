package bitBank;

public class AccessTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAgency(1);
		//account1.balance = 200;
		System.out.println(account1.withdraw(300));
		System.out.println(account1.getBalance());
		System.out.println(account1.getAgency());
		account1.setAgency(10);
		System.out.println(account1.getAgency());

	}

}
