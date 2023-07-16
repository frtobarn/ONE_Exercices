package classes;
public class TestOfficial {

	public static void main(String[] args) {
		Official official = new Accountant("Fanto", "1033724677", 3000);
		System.out.println(official.getPayment());
		System.out.println(official.getBonus());
	}

}
