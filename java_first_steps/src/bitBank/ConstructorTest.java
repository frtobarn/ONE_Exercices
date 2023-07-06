package bitBank;

public class ConstructorTest {

	public static void main(String[] args) {
		Account account= new Account(2);
		Account account2= new Account(3);
		//VAriable de clase. No de instancia
		//System.out.println(Account.totalAccounts);
		
		System.out.println(Account.getTotalAccounts());
		
	}

}
