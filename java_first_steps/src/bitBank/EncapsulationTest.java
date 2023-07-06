package bitBank;

public class EncapsulationTest {

	public static void main(String[] args) {
		Account account =  new Account();
		Customer customer =  new Customer();
		customer.setName("Fanto");
		customer.setId("1033724677");
		
		account.setOwner(customer);
		
		System.out.println(customer.getName());
		System.out.println(account.getOwner().getName());
	}

}
